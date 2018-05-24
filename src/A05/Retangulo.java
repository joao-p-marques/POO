package A05;

public class Retangulo extends Figura {
	private int lado1;
	private int lado2;

	public Retangulo(Ponto centro, String cor, int lado1, int lado2) {
		super(centro, cor);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado1() {
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
		return "Retangulo [Lado1=" + lado1 + ", Lado2=" + lado2 + ", " + super.toString() + "]";
	}

}
