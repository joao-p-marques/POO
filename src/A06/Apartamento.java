package A06;

public class Apartamento extends Alojamento {
	private int nQuartos;

	public Apartamento(String nome, String local, double preco, double avaliacao, int nQuartos) {
		super(nome, local, preco, avaliacao);
		this.nQuartos = nQuartos;
	}

	public int getnQuartos() {
		return nQuartos;
	}

	public void setnQuartos(int nQuartos) {
		this.nQuartos = nQuartos;
	}

	@Override
	public String toString() {
		return "Apartamento [nQuartos=" + nQuartos + "]";
	}
}