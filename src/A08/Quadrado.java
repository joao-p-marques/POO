package A08;

public class Quadrado extends Retangulo {

	public Quadrado(Ponto centro, String cor, double lado) {
		super(centro, cor, lado, lado);
	}

	public Quadrado(double l) {
		// TODO Auto-generated constructor stub
		super(new Ponto(0, 0), "Branco", l, l);
	}

	public Quadrado(int x, int y, double lado) {
		// TODO Auto-generated constructor stub
		super(new Ponto(x, y), "Branco", lado, lado);
	}

	@Override
	public String toString() {
		return "Quadrado de Centro: " + super.getCentro() + ", Dimensoes: " + super.getLado1() + "x" + super.getLado2() + ", Cor: " + super.getCor() + ", Area: " + super.calcArea() + ", Perimetro: " + super.calcPer();
	}
	
	

}
