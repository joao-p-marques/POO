package A10;

import java.util.ArrayList;
import java.util.List;

public class Companhia {
	private String sigla;
	private String nome;
	private List<Voo> voos;
	
	public void addVoo(Voo v) {
		voos.add(v);
	}
	
	public void getVoos(List<Voo> voosL) {
		for(Voo voo : voosL) {
			if(voo.getCompanhia().equals(this)) {
				this.addVoo(voo);
			}
		}
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Companhia(String sigla, String nome) {
		super();
		this.sigla = sigla;
		this.nome = nome;
		this.voos = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Companhia [sigla=" + sigla + ", nome=" + nome + "]";
	}
	
	public String toStringWithV() {
		return this.toString() + ", voos=" + voos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Companhia other = (Companhia) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}
	
	public Hora calcMediaAtraso() {
		int minutosT = 0;
		for(Voo voo : this.voos) {
			minutosT += voo.getAtraso().toMinutos();
		}
		int mediaAtraso = minutosT / this.voos.size();
		return Hora.toHora(mediaAtraso);
	}
}











