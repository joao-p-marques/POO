package A06;

import java.util.Arrays;

public class Jogo {
	private String equipa1;
	private String equipa2;
	private int[] tempoTotal;
	private int[] tempoDecorrido;
	private Bola bola;
	
	public Jogo(String equipa1, String equipa2, Bola bola) {
		super();
		this.equipa1 = equipa1;
		this.equipa2 = equipa2;
		this.bola = bola;
	}

	public String getEquipa1() {
		return equipa1;
	}

	public void setEquipa1(String equipa1) {
		this.equipa1 = equipa1;
	}

	public String getEquipa2() {
		return equipa2;
	}

	public void setEquipa2(String equipa2) {
		this.equipa2 = equipa2;
	}

	public int[] getTempoDecorrido() {
		return tempoDecorrido;
	}

	public void setTempoDecorrido(int horas, int minutos, int segundos) {
		int[] temp = {horas, minutos, segundos};
		this.tempoDecorrido = temp;
	}
	
	public void golo(Equipa marcou, Equipa sofreu, Robo marcouJ) {
		marcouJ.marcarGolo();
		marcou.updateGoals();
		sofreu.sofreuGolo();
	}

	@Override
	public String toString() {
		return "Jogo [equipa1=" + equipa1 + ", equipa2=" + equipa2 + ", tempoTotal=" + Arrays.toString(tempoTotal)
				+ ", tempoDecorrido=" + Arrays.toString(tempoDecorrido) + ", bola=" + bola + "]";
	}
	
	
}
