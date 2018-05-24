package A07;

public class Classe123 extends Pessoa implements IDemo123{
	private int atributo1;

	public Classe123(String nome, int cc, Data dataNasc, int atributo1) {
		super(nome, cc, dataNasc);
		this.atributo1 = atributo1;
	}
	
	public void metodo123() {
		System.out.println("Metodo 123");
	}

	@Override
	public void metodo11() {
		// TODO Auto-generated method stub
		System.out.println("Metodo 11");
	}

	@Override
	public void metodo12() {
		// TODO Auto-generated method stub
		System.out.println("Metodo 12");
	}

	@Override
	public void metodo21() {
		// TODO Auto-generated method stub
		System.out.println("Metodo 21");
	}

	@Override
	public void metodo22() {
		// TODO Auto-generated method stub
		System.out.println("Metodo 22");
	}

	@Override
	public void metodo31() {
		// TODO Auto-generated method stub
		System.out.println("Metodo 31");
	}

	@Override
	public void metodo32() {
		// TODO Auto-generated method stub
		System.out.println("Metodo 32");
	}

	@Override
	public String toString() {
		return "Classe123 [atributo1=" + atributo1 + super.toString() + "]";
	}
}
