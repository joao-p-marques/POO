package A04;

public class Livro {
	private int id;
	private String titulo;
	private String tipo_emprestimo;
	public static int idC = 100;
	private boolean disponivel;
	
	public Livro(String titulo, String tipo_emprestimo) {
		this.titulo = titulo;
		this.tipo_emprestimo = tipo_emprestimo;
		this.id = idC;
		idC++;
		this.disponivel = true;
	}
	public Livro(String titulo) {
		this.titulo = titulo;
		this.tipo_emprestimo = "NORMAL";
		this.id = idC;
		idC++;
		this.disponivel = true;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo_emprestimo() {
		return tipo_emprestimo;
	}
	public void setTipo_emprestimo(String tipo_emprestimo) {
		this.tipo_emprestimo = tipo_emprestimo;
	}
	public int getId() {
		return id;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	@Override
	public String toString() {
		return "Livro " + id + ": " + titulo + ", " + tipo_emprestimo + ", disponivel=" + disponivel;
	}
}
