package A06;

public class Robo extends Movel {
	public enum TipoJogador{
		GuardaRedes, Avancado, Defesa, Medio;
	}
	
	private String id;
	private TipoJogador tipo;
	private int golosMarcados;
	private static int idC=1;
	
	public Robo(int x, int y, double maxSpeed, TipoJogador tipo, int golosMarcados) {
		super(x, y, maxSpeed);
		this.tipo = tipo;
		this.id = "Robo"+ idC;
		idC++;
		this.golosMarcados = golosMarcados; 
	}

	public TipoJogador getTipo() {
		return tipo;
	}

	public void setTipo(TipoJogador tipo) {
		this.tipo = tipo;
	}

	public int getGolosMarcados() {
		return golosMarcados;
	}

	public void setGolosMarcados(int golosMarcados) {
		this.golosMarcados = golosMarcados;
	}

	public String getId() {
		return id;
	}
		
	public void marcarGolo() {
		this.golosMarcados++;
	}

	@Override
	public String toString() {
		return "Robo [id=" + id + ", tipo=" + tipo + ", golosMarcados=" + golosMarcados + "]";
	}
	
}
