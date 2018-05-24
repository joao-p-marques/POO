package A09;

public class Brinquedo {
	private String tipo;

	public Brinquedo(String tipo) {
		super();
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Brinquedo [tipo=" + tipo + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
