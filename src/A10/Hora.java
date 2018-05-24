package A10;

public class Hora implements Comparable<Hora>{
	private int hora;
	private int minutos;
	
	public static Hora addHora(Hora o1, Hora o2) {
		int nHora = (o1.getHora() + o2.getHora()) + (o1.getMinutos() + o2.getMinutos())/60;
		int nMinutos = (o1.getMinutos() + o2.getMinutos())%60;
		
		return new Hora(nHora, nMinutos);
	}
	
	public Hora(int hora, int minutos) {
		super();
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public int toMinutos() {
		return this.getHora()*60 + this.getMinutos();
	}
	
	public static Hora toHora(int minutos) {
		return new Hora(minutos/60, minutos%60);
	}
	
	@Override
	public String toString() {
		if(minutos < 10) {
			return hora + ":0" + minutos;
		}
		return hora + ":" + minutos;
	}

	@Override
	public int compareTo(Hora arg0) {
		if (this.getHora() == arg0.getHora()) return this.getMinutos()-arg0.getMinutos();
		return this.getHora()-arg0.getHora();
	}
}	
