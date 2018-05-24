package A08;

import java.util.Random;

public class Peixe extends Alimento {
	private VariedadePeixe variedade;

	public Peixe(double proteinas, double calorias, double peso, VariedadePeixe variedade) {
		super(proteinas, calorias, peso);
		this.variedade = variedade;
	}

	public Peixe() {
		super();
		Random r = new Random();
		this.variedade = VariedadePeixe.values()[(r.nextInt(1))]; //numero aleatorio entre 0 e 1
	}

	public VariedadePeixe getVariedade() {
		return variedade;
	}

	public void setVariedade(VariedadePeixe variedade) {
		this.variedade = variedade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((variedade == null) ? 0 : variedade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peixe other = (Peixe) obj;
		if (variedade != other.variedade)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Peixe [variedade=" + variedade + ", " + super.toString() + "]";
	}
}
