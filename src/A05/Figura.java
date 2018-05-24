package A05;

public class Figura {
	private Ponto centro;
	private String cor;

	public Figura(Ponto centro, String cor) {
		super();
		this.centro = centro;
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Ponto getCentro() {
		return centro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
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
//		Figura other = (Figura) obj;
//		if (centro == null) {
//			if (other.centro != null)
//				return false;
//		} else if (!centro.equals(other.centro))
//			return false;
		return true;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	@Override
	public String toString() {
		return "Cor: " + cor + ", Centro: " + centro.toString();
	}
	
	
}
