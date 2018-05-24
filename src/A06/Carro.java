package A06;

public class Carro {
	public enum Combustivel{
		Gasolina, Diesel;
	}

	public enum ClasseCarro{
		A, B, C, D, E, F;
	}
	
	private ClasseCarro classe;
	private Combustivel combustivel;
	
	public Carro(ClasseCarro classe, Combustivel combustivel) {
		super();
		this.classe = classe;
		this.combustivel = combustivel;
	}

	public ClasseCarro getClasse() {
		return classe;
	}

	public void setClasse(ClasseCarro classe) {
		this.classe = classe;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		return "Carro [classe=" + classe + ", combustivel=" + combustivel + "]";
	}
	
}
