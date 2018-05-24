package A11;

public class Regiao implements Comparable<Regiao>{
	private String nome;
	private int populacao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + populacao;
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
		Regiao other = (Regiao) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (populacao != other.populacao)
			return false;
		return true;
	}
	@Override
	public int compareTo(Regiao o) {
		return this.getPopulacao() - o.getPopulacao();
	}
	@Override
	public String toString() {
		return "Regiao: " + nome + " (Populacao: " + populacao + ")";
	}
	
	public int compareToByName(Regiao o) {
		return this.getNome().compareTo(o.getNome());
	}
}
