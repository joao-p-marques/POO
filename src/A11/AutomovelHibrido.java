package A11;

public class AutomovelHibrido extends Automovel implements Eletrico, Propulsao {
	private double emissaoCO2;
	private double autonomia;

	@Override
	public String toString() {
		return "AutomovelHibrido [" + super.toString() + "emissaoCO2=" + emissaoCO2 + ", autonomia=" + autonomia + "]";
	}

	public AutomovelHibrido(String matricula, int ano, Cor cor, int potencia, double emissaoCO2, double autonomia) {
		super(matricula, ano, cor, potencia);
		this.emissaoCO2 = emissaoCO2;
		this.autonomia = autonomia;
	}

	public void setEmissaoCO2(double emissaoCO2) {
		this.emissaoCO2 = emissaoCO2;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	@Override
	public double getEmissaoCO2() {
		// TODO Auto-generated method stub
		return this.emissaoCO2;
	}

	public AutomovelHibrido(String matricula, int ano, Cor cor, int potencia) {
		super(matricula, ano, cor, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAutonomia() {
		// TODO Auto-generated method stub
		return this.autonomia;
	}

}
