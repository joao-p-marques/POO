package A04;

public class Circulo {
	private String cor;
	private Ponto centro = new Ponto();
	private double raio;
	
	public Circulo() {
		this.cor="preto";
		this.centro = new Ponto(0, 0);
		this.raio = 0;
	}
	public Circulo(double x, double y, double raio, String cor) {
		this.cor = cor;
		this.centro = new Ponto(x, y);
		this.raio = raio;
	}
	public Circulo(Ponto centro, double raio, String cor) {
		this.cor = cor;
		this.centro = centro;
		this.raio = raio;
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
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {		
		this.raio = raio;
	}
	
	@Override
	public String toString() {
		return "O Circulo tem cor " + cor + ", centro no ponto " + centro + " e raio=" + raio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(raio);
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
		Circulo other = (Circulo) obj;
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
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}
	
	public double calcArea() {
		return (Math.PI * this.raio*this.raio);
	}
	public double calcPer() {
		return (2*Math.PI*this.raio);
	}
	public boolean intercept(Circulo c2) {
//		if ((Math.pow(this.centro.getX(), 2) + Math.pow(this.centro.getY(), 2) - Math.pow(this.raio, 2)) <= 
//				(Math.pow(c2.centro.getX(), 2) + Math.pow(c2.centro.getY(), 2) - Math.pow(c2.raio, 2))) {
//			return true;
//		}
		if (this.centro.dist(c2.getCentro()) <= (this.raio + c2.getRaio())) {
			return true;
		}
		return false;
	}
}
