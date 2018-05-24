package A10;

public class Cidade implements Comparable<Cidade>{
	private String nome;
	private int voos;
	public Cidade(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVoos() {
		return voos;
	}
	public void setVoos(int voos) {
		this.voos = voos;
	}
	@Override
	public String toString() {
		return nome;
	}
	public void addVoo() {
		this.setVoos(this.getVoos()+1);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Cidade other = (Cidade) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public int compareTo(Cidade arg0) {
		return this.getNome().compareTo(arg0.getNome());
	}
}
