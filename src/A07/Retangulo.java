package A07;

public class Retangulo extends Figura {
	private double lado1;
	private double lado2;

	public Retangulo(Ponto centro, String cor, double lado1, double lado2) {
		super(centro, cor);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public Retangulo(int x, int y, double lado1, double lado2) {
		// TODO Auto-generated constructor stub
		super(new Ponto(x, y), "Branco");
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public Retangulo(double l1, double l2) {
		// TODO Auto-generated constructor stub
		super(new Ponto(0, 0), "Branco");
		this.lado1 = l1;
		this.lado2 = l2;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	
	public double calcArea() {
		return this.lado1*this.lado2;
	}
	
	public double calcPer() {
		return 2*this.lado1 + 2*this.lado2;
	}

	@Override
	public String toString() {
		return "Retangulo de Centro: " + super.getCentro() + ", Dimensoes: " + this.getLado1() + "x" + this.getLado2() + ", Cor: " + super.getCor() + ", Area: " + this.calcArea() + ", Perimetro: " + this.calcPer();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(lado1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lado2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(lado1) != Double.doubleToLongBits(other.lado1))
			return false;
		if (Double.doubleToLongBits(lado2) != Double.doubleToLongBits(other.lado2))
			return false;
		return true;
	}

}
