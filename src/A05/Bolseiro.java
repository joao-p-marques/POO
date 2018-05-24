package A05;

public class Bolseiro extends Aluno {
	private int bolsa;

	public Bolseiro(String nome, int cc, Data dataNasc, Data dataInsc, int bolsa) {
		super(nome, cc, dataNasc, dataInsc);
		this.bolsa = bolsa;
	}

	public Bolseiro(String nome, int cc, Data dataNasc, Data dataInsc) {
		super(nome, cc, dataNasc, dataInsc);
		// TODO Auto-generated constructor stub
	}

	public Bolseiro(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
		// TODO Auto-generated constructor stub
	}

	
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	
	@Override
	public String toString() {
		return super.toString() + ", Bolsa=" + bolsa;
	}	
}
