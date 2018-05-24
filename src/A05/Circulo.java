package A05;

public class Circulo extends Figura {
	private double raio;

	public Circulo(Ponto centro, String cor, double raio) {
		super(centro, cor);
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
		return "Circulo [Raio=" + raio + ", " + super.toString() + "]";
	}

}
