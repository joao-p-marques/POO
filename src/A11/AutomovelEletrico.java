package A11;

public class AutomovelEletrico extends Automovel implements Eletrico {
	private double autonomia;

	@Override
	public double getAutonomia() {
		// TODO Auto-generated method stub
		return this.autonomia;
	}

	public AutomovelEletrico(String matricula, int ano, Cor cor, int potencia, double autonomia) {
		super(matricula, ano, cor, potencia);
		this.autonomia = autonomia;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AutomovelEletrico [" + super.toString() + "autonomia=" + autonomia + "]";
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

}
