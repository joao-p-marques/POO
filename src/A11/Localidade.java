package A11;

public class Localidade {
	private String nome;
	private int populacao;
	private TipoLocalidade tipo;
	
	public Localidade() {
		this.setNome("");
		this.setPopulacao(0);
		this.setTipo(TipoLocalidade.Cidade);
	}
	
	public Localidade(String nome, int populacao, TipoLocalidade tipo) {
		this.setNome(nome);
		this.setPopulacao(populacao);
		this.setTipo(tipo);
	}
	
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
	public TipoLocalidade getTipo() {
		return tipo;
	}
	public void setTipo(TipoLocalidade tipo) {
		this.tipo = tipo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + populacao;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Localidade other = (Localidade) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (populacao != other.populacao)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		if(this.getNome()=="" || this.getPopulacao()==0)
			return "*Indefinida*";
		return "Cidade " + this.getNome() + ", população: " + this.getPopulacao();
	}
}
