package A04;

public class Utilizador {
	private String nome;
	private String curso;
	private int nMec;
	private Livro livrosRequisitados[] = new Livro[3];

	public Utilizador(String nome, int nMec, String curso) {
		this.nome = nome;
		this.curso = curso;
		this.nMec = nMec;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNMec() {
		return nMec;
	}

	public void setNmec(int nMec) {
		this.nMec = nMec;
	}


	
	public void requisitouLivro(Livro l) {
		int c=0;
		for(int i=0; i<this.livrosRequisitados.length; i++) {
			if(this.livrosRequisitados[i]==null) {
				this.livrosRequisitados[i] = l;
				l.setDisponivel(false);
				c++;
				break;
			}
		}
		//System.out.println("[Aluno pode requisitar " + c + " livros]");
		if(c==0) {
			System.out.println("O aluno não pode requisitar mais livros!");
		}
	}
	
	public void devolveuLivro(Livro l) {
		for(int i=0; i<this.livrosRequisitados.length; i++) {
			if(this.livrosRequisitados[i]==l) {
				this.livrosRequisitados[i] = null;
				l.setDisponivel(true);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Aluno: " + this.nMec + "; " + this.nome + "; " + this.curso;
	}
}
