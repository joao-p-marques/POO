package A10;

import java.util.Set;

public class Voo{
	private Hora hora;
	private String nome;
	private Cidade origem;
	private Hora atraso;
	private String obs;
	private Companhia companhia;
	
	public Voo(Hora hora, String nome, Cidade origem, Hora atraso, String obs) {
		super();
		this.hora = hora;
		this.nome = nome;
		this.origem = origem;
		this.atraso = atraso;
		this.obs = obs;
	}
	
	public Voo(Hora hora, String nome, Cidade origem, Hora atraso) {
		super();
		this.hora = hora;
		this.nome = nome;
		this.origem = origem;
		this.atraso = atraso;
		this.obs = "";
	}
	
	public Voo(Hora hora, String nome, Cidade origem) {
		super();
		this.hora = hora;
		this.nome = nome;
		this.origem = origem;
		this.atraso = new Hora(0, 0);
		this.obs = "";
	}
	
	public Voo(int hora, int minutos, String nome, Cidade origem) {
		super();
		this.hora = new Hora(hora, minutos);
		this.nome = nome;
		this.origem = origem;
		this.atraso = new Hora(0, 0);
		this.obs = "";
	}

	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade getOrigem() {
		return origem;
	}
	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}
	public Hora getAtraso() {
		return atraso;
	}
	public void setAtraso(Hora atraso) {
		this.atraso = atraso;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		return "Voo [hora=" + hora + ", nome=" + nome + ", origem=" + origem + ", atraso=" + atraso + ", obs=" + obs;
	}
	
	public String toStringWithComp() {
		return this.toString() + ", companhia=" + this.getCompanhia() + "]";
	}
	
	public void setCompanhia(Set<Companhia> companhias) {
		for(Companhia companhia : companhias) {
			if(this.getNome().startsWith(companhia.getSigla())) {
				this.companhia = companhia;
				return;
			}
		}
	}
	
	public Companhia getCompanhia() {
		return this.companhia;
	}

	public void setCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}
}








