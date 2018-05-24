package A11;

public class Moto extends Veiculo {
	private int potencia;

	public int getPotencia() {
		return potencia;
	}

	public Moto(String matricula, int ano, Cor cor, int potencia) {
		super(matricula, ano, cor);
		this.potencia = potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Moto [" + super.toString() + "potencia=" + this.getPotencia() + "]";
	}

}
