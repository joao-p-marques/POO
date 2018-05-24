package A11;

public class AutomovelPropulosao extends Automovel implements Propulsao {
	private double emissaoCO2;

	@Override
	public String toString() {
		return "AutomovelPropulosao [" + super.toString() + "emissaoCO2=" + emissaoCO2 + "]";
	}

	public void setEmissaoCO2(double emissaoCO2) {
		this.emissaoCO2 = emissaoCO2;
	}

	public AutomovelPropulosao(String matricula, int ano, Cor cor, int potencia, double emissaoCO2) {
		super(matricula, ano, cor, potencia);
		this.emissaoCO2 = emissaoCO2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getEmissaoCO2() {
		// TODO Auto-generated method stub
		return this.emissaoCO2;
	}

}
