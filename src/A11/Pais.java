package A11;

import java.util.*;

public class Pais implements Comparable<Pais>{
	private String nome;
	private Localidade capital;
	private int populacao;
	private Collection<Regiao> regioes;
	
	public Pais(String nome, Localidade capital) {
		this.setNome(nome);
		this.setCapital(capital);
		this.regioes = new TreeSet<>();
		this.populacao = 0;
	}
	
	public List<Regiao> sortByName() {
		List<Regiao> regioesS = new ArrayList<>();
		regioesS.addAll(this.regioes);
		Collections.sort(regioesS, new Comparator<Regiao>() {
			@Override
			public int compare(Regiao arg0, Regiao arg1) {
				// TODO Auto-generated method stub
				return arg0.compareToByName(arg1);
			}
		});
		return regioesS;
	}

	public Pais(String nome) {
		this.setNome(nome);
		this.setCapital(new Localidade());
	}

	public void addRegiao(Regiao r) {
		regioes.add(r);
		populacao += r.getPopulacao();
	}
	
	public void remRegiao(Regiao r) {
		if(!regioes.contains(r)) {
			System.out.println("O país não contém a região a remover!");
			return;
		}
		regioes.remove(r);
		this.populacao -= r.getPopulacao();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Localidade getCapital() {
		return capital;
	}
	public void setCapital(Localidade capital) {
		this.capital = capital;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Pais other = (Pais) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pais: " + nome + ", População: " + this.populacao + " (Capital: " + capital + ")";
	}

	@Override
	public int compareTo(Pais o) {
		return this.getPopulacao() - o.getPopulacao(); 
	}

	public int getPopulacao() {
		return populacao;
	}

	public Collection<Regiao> getRegioes() {
		return regioes;
	}

	public void setRegioes(Collection<Regiao> regioes) {
		this.regioes = regioes;
	}
	
	public String printPais() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pais: " + nome + ", População: " + this.populacao + " (Capital: " + capital + ")" + 
				"\nRegioes: \n");
		for(Regiao r : regioes) {
			sb.append(r + "\n");
		}
		return sb.toString();
	}
}
