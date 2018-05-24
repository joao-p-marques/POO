package A08;

import java.util.Random;

public abstract class Alimento {
	private double proteinas;
	private double calorias;
	private double peso;
	
	public Alimento(double proteinas, double calorias, double peso) {
		super();
		this.proteinas = proteinas;
		this.calorias = calorias;
		this.peso = peso;
	}

	public Alimento() {
		super();
		
		Random r = new Random();
		this.proteinas = 0 + (100 - 0) * r.nextDouble(); //valor aleatorio entre 0 e 100
		this.calorias = 0 + (100 - 0) * r.nextDouble();
		this.peso = 0 + (100 - 0) * r.nextDouble();
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Alimento [proteinas=" + proteinas + ", calorias=" + calorias + ", peso=" + peso + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(proteinas);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alimento other = (Alimento) obj;
		if (Double.doubleToLongBits(calorias) != Double.doubleToLongBits(other.calorias))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (Double.doubleToLongBits(proteinas) != Double.doubleToLongBits(other.proteinas))
			return false;
		return true;
	}
}
