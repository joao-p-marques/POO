package A08;

public class Prato implements Comparable{
	private String nome;
	private Conjunto<Alimento> composicao;
	private double maxCalorias;
	
	
	public Prato(String nome, Conjunto<Alimento> composicao, double maxCalorias) {
		super();
		this.nome = nome;
		this.composicao = composicao;
		this.maxCalorias = maxCalorias;
	}
	
	public Prato(String nome, double maxCalorias) {
		super();
		this.nome = nome;
		this.composicao = new Conjunto<>();
		this.maxCalorias = maxCalorias;
	}
	
	public Prato(String nome) {
		super();
		this.nome = nome;
		this.composicao = new Conjunto<>();
		this.maxCalorias = 2000;
	}
	
	public boolean addIngrediente(Alimento a) {
		return this.composicao.insert(a);
	}
	
	public void removeAlimento(Alimento a) {
		this.composicao.remove(a);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Conjunto<Alimento> getComposicao() {
		return composicao;
	}
	public void setComposicao(Conjunto<Alimento> composicao) {
		this.composicao = composicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((composicao == null) ? 0 : composicao.hashCode());
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
		Prato other = (Prato) obj;
		if (composicao == null) {
			if (other.composicao != null)
				return false;
		} else if (!composicao.equals(other.composicao))
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
		return "Prato [nome=" + nome + ", composicao=" + composicao + "]";
	}

	@Override
	public Prato ordenar() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getMaxCalorias() {
		return maxCalorias;
	}

	public void setMaxCalorias(double maxCalorias) {
		this.maxCalorias = maxCalorias;
	}
}
