package A11;

public abstract class Veiculo {
	private String matricula;
	private int ano;
	private Cor cor;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public String getMatricula() {
		return matricula;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Veiculo other = (Veiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (ano != other.ano)
			return false;
		if (cor != other.cor)
			return false;
		return true;
	}
	public Veiculo(String matricula, int ano, Cor cor) {
		super();
		this.matricula = matricula;
		this.ano = ano;
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "Veiculo [matricula=" + matricula + ", ano=" + ano + ", cor=" + cor + "]";
	}
	
	public int compareTo(Veiculo other) {
		return this.getMatricula().compareTo(other.getMatricula());
	}
	
	
	
}
