package A11;

public class Automovel extends Veiculo {
	private int potencia;

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Automovel [" + super.toString() + "potencia=" + this.getPotencia() + "]";
	}

	public Automovel(String matricula, int ano, Cor cor, int potencia) {
		super(matricula, ano, cor);
		this.potencia = potencia;
	}

	
}
