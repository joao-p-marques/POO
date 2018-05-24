package A08;

import java.util.Random;

import A08.VariedadeCarne;

public class Carne extends Alimento {
	private VariedadeCarne variedade;

	public Carne(double proteinas, double calorias, double peso, VariedadeCarne variedade) {
		super(proteinas, calorias, peso);
		this.variedade = variedade;
	}

	public Carne() {
		super();
		Random r = new Random();
		this.variedade = VariedadeCarne.values()[(r.nextInt(4))]; //numero aleatorio entre 0 e 4
	}

	public VariedadeCarne getVariedade() {
		return variedade;
	}

	public void setVariedade(VariedadeCarne variedade) {
		this.variedade = variedade;
	}

	@Override
	public String toString() {
		return "Carne [variedade=" + variedade + ", " + super.toString() + "]";
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
		Carne other = (Carne) obj;
		if (variedade != other.variedade)
			return false;
		return true;
	}
	
	
}
