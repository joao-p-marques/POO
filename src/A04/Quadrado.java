package A04;

public class Quadrado {
	private String cor;
	private Ponto centro = new Ponto();
	private double lado;
	
	public Quadrado() {
		this.cor="preto";
		this.centro = new Ponto(0, 0);
		this.lado = 0;
	}
	public Quadrado(double x, double y, double lado, String cor) {
		this.cor = cor;
		this.centro = new Ponto(x, y);
		this.lado = lado;
	}
	public Quadrado(Ponto centro, double lado, String cor) {
		this.cor = cor;
		this.centro = centro;
		this.lado = lado;
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
	public void setCentro(Ponto centro) {
		this.centro = centro;
	}
	public double getLado() {
		return this.lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String toString() {
		return "O Quadrado tem cor " + cor + ", centro no ponto " + centro + "e lado com comprimento " + lado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(lado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Quadrado other = (Quadrado) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (Double.doubleToLongBits(lado) != Double.doubleToLongBits(other.lado))
			return false;
		return true;
	}

	public double calcArea() {
		return (this.lado * this.lado);
	}
	public double calcPer() {
		return (4*this.lado);
	}
}
