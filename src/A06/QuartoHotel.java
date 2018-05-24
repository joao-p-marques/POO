package A06;

public class QuartoHotel extends Alojamento {
	public enum TipoQuarto{
		Single, Double, Twin;
	}
	
	private TipoQuarto tipoQuarto;
	
	public QuartoHotel(String nome, String local, double preco, double avaliacao, TipoQuarto tipoQuarto) {
		super(nome, local, preco, avaliacao);
		this.tipoQuarto = tipoQuarto;
	}

	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(TipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
}
