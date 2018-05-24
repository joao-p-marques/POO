package A06;

public class Bola extends Movel {
	public enum TipoCor{
		Laranja, Amarela, Azul, Vermelha;
	}
	private TipoCor cor;

	public Bola(int x, int y, double maxSpeed, TipoCor cor) {
		super(x, y, maxSpeed);
		this.cor = cor;
	}

	public TipoCor getCor() {
		return cor;
	}

	public void setCor(TipoCor cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Bola [cor=" + cor + "]";
	}
	
	
}
