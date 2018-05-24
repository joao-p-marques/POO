package A11;

public class MotoEletrica extends Moto implements Eletrico {
	private double autonomia;

	@Override
	public String toString() {
		return "MotoEletrica [" + super.toString() + "autonomia=" + autonomia + "]";
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public MotoEletrica(String matricula, int ano, Cor cor, int potencia) {
		super(matricula, ano, cor, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAutonomia() {
		// TODO Auto-generated method stub
		return this.autonomia;
	}

}
