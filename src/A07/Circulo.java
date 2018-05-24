package A07;

public class Circulo extends Figura {
	private double raio;

	public Circulo(Ponto centro, String cor, double raio) {
		super(centro, cor);
		this.raio = raio;
	}

	public Circulo(double raio) {
		// TODO Auto-generated constructor stub
		super(new Ponto(0, 0), "Branco");
		this.raio = raio;
	}

	public Circulo(int x, int y, double raio) {
		// TODO Auto-generated constructor stub
		super(new Ponto(x, y), "Branco");
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcArea() {
		return Math.PI*Math.pow(this.raio, 2);
	}
	
	public double calcPer() {
		return 2*Math.PI*this.raio;
	}

	@Override
	public String toString() {
		return "Circulo de Centro: " + super.getCentro() + " e de Raio: " + raio + ", Cor: " + super.getCor() + ", Area: " + this.calcArea() + ", Perimetro: " + this.calcPer();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(raio);
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
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}

}
