package A06;

public class Alojamento {
	private int id;
	private String nome;
	private String local;
	private double preco;
	private double avaliacao;
	private boolean disponivel;
	private static int idC;
	
	public Alojamento(String nome, String local, double preco, double avaliacao) {
		super();
		this.nome = nome;
		this.local = local;
		this.preco = preco;
		this.avaliacao = avaliacao;
		this.id = idC;
		idC++;
		this.disponivel = true;
	}
	
	public void avaliar(double avaliacao) {
		if(avaliacao>=1.0 && avaliacao<=5.0) {
			this.avaliacao = avaliacao;
		}
		else {
			System.out.println("Avaliacao Invalida");
		}
	}
	
	public void ocupar() {
		this.disponivel = false;
	}
	
	public boolean isDisponivel() {
		return this.disponivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	@Override
	public String toString() {
		return "Alojamento [id=" + id + ", nome=" + nome + ", local=" + local + ", preco=" + preco + ", avaliacao="
				+ avaliacao + ", disponivel=" + disponivel + "]";
	}
}
