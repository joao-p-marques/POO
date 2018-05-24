package A11;

public class MotoPropulsao extends Moto implements Propulsao {
	private double emissaoCO2;

	@Override
	public String toString() {
		return "MotoPropulsao [" + super.toString() + "emissaoCO2=" + emissaoCO2 + "]";
	}

	public void setEmissaoCO2(double emissaoCO2) {
		this.emissaoCO2 = emissaoCO2;
	}

	public MotoPropulsao(String matricula, int ano, Cor cor, int potencia) {
		super(matricula, ano, cor, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getEmissaoCO2() {
		// TODO Auto-generated method stub
		return this.emissaoCO2;
	}

}
