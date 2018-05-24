package A10;

public class AtrasosCompanhia {
	private Companhia companhia;
	private Hora atraso;
	public AtrasosCompanhia(Companhia companhia, Hora atraso) {
		super();
		this.companhia = companhia;
		this.atraso = atraso;
	}
	public Companhia getCompanhia() {
		return companhia;
	}
	public void setCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}
	public Hora getAtraso() {
		return atraso;
	}
	public void setAtraso(Hora atraso) {
		this.atraso = atraso;
	}
	@Override
	public String toString() {
		return "[Companhia=" + companhia + ": Atraso=" + atraso + "]";
	}
}
