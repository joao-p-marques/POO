package A09;

public class Funcionario {
	private String nome;

	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
