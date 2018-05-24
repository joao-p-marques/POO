package A06;

import java.util.Arrays;

public class Equipa {
	private String nome;
	private String responsavel;
	private int golosMarcados;
	private int golosSofridos;
	private Robo[] robos;
	private int nRobos=0;
	
	public Equipa(String nome, String responsavel) {
		super();
		this.nome = nome;
		this.responsavel = responsavel;
		this.golosMarcados = 0;
		this.golosSofridos = 0;
		this. robos = new Robo[5];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public int getGolosMarcados() {
		return golosMarcados;
	}

	public void setGolosMarcados(int golosMarcados) {
		this.golosMarcados = golosMarcados;
	}

	public int getGolosSofridos() {
		return golosSofridos;
	}

	public void setGolosSofridos(int golosSofridos) {
		this.golosSofridos = golosSofridos;
	}

	public Robo[] getRobos() {
		return robos;
	}
	
	public void adicionarRobo(Robo r) {
		if(nRobos<5) {
			robos[nRobos]=r;
			System.out.println("Robo adicionado - " + r);
		}
		else {
			System.out.println("Não é possível adicionar mais robos.");
		}	
	}
	
	public void updateGoals() {
		this.golosMarcados = 0;
		for(Robo i : robos) {
			if(i==null) break;
			this.golosMarcados += i.getGolosMarcados();
		}
	}
	
	public void sofreuGolo() {
		this.golosSofridos++;
	}

	@Override
	public String toString() {
		return "Equipa [nome=" + nome + ", responsavel=" + responsavel + ", golosMarcados=" + golosMarcados
				+ ", golosSofridos=" + golosSofridos + ", robos=" + Arrays.toString(robos) + "]";
	}
	
		
	
}
