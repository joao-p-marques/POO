package A04;

public class Retangulo {
	private String cor;
	private Ponto centro = new Ponto();
	private double l1, l2;
	
	public Retangulo() {
		this.cor="preto";
		this.centro = new Ponto(0, 0);
		this.l1 = 0;
		this.l2 = 0;
	}
	public Retangulo(double x, double y, double l1, double l2, String cor) {
		this.cor = cor;
		this.centro = new Ponto(x, y);
		this.l1 = l1;
		this.l2 = l2;
	}
	public Retangulo(Ponto centro, double l1, double l2, String cor) {
		this.cor = cor;
		this.centro = centro;
		this.l1 = l1;
		this.l2 = l2;
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
	public double getL1() {
		return l1;
	}
	public void setL1(double l1) {
		this.l1 = l1;
	}
	public double getL2() {
		return l2;
	}
	public void setL2(double l2) {
		this.l2 = l2;
	}
	
	@Override
	public String toString() {
		return "O Retangulo tem cor " + cor + ", centro no ponto " + centro + ", lado 1 com comprimento " + l1 + "e lado 2 com comprimento " + l2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(l1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(l2);
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
		Retangulo other = (Retangulo) obj;
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
		if (Double.doubleToLongBits(l1) != Double.doubleToLongBits(other.l1))
			return false;
		if (Double.doubleToLongBits(l2) != Double.doubleToLongBits(other.l2))
			return false;
		return true;
	}
	
	public double calcArea() {
		return (this.l1 * this.l2);
	}
	public double calcPer() {
		return (2*this.l1 + 2*this.l2);
	}
}
