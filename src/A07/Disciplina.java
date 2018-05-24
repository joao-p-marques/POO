package A07;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private Professor responsavel;
	private ArrayList<Aluno> alunos;
	
	public Disciplina(String nome, Professor responsavel) {
		super();
		this.nome = nome;
		this.responsavel = responsavel;
		this.alunos = new ArrayList<>();
	}
	
	public void inscreverAluno(Aluno a) {
		alunos.add(a);
	}

	@Override
	public String toString() {
		String ret = "Disciplina " + nome + ": \nResponsavel:" + responsavel + "\nAlunos:\n";
		for (Aluno a : alunos) {
			ret += a + "\n";
		}
		return ret;
	}
	
	
}
