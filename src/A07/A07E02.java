package A07;

public class A07E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor p1 = new Professor("Pedro", 147258369, 4, 5, 1970, "Informatica");
		Professor p2 = new Professor("Carlos", 555444111, 4, 1, 1968, "Eletronica");
		
		Aluno a1 = new Aluno("João", 123456789, 1, 2, 1999, 1, 1, 2017);
		Aluno a2 = new Aluno("Pedro", 2345689, 1, 1, 1111);
		Aluno a3 = new AlunoPosGrad("Antonio", 789456123, 1, 2, 1999, 2, 1, 2018, p1);
		
		Disciplina d1 = new Disciplina("POO", p1);
		Disciplina d2 = new Disciplina("IAC", p2);
		
		d1.inscreverAluno(a1);
		d1.inscreverAluno(a2);
		d2.inscreverAluno(a1);
		d2.inscreverAluno(a3);
		
		System.out.println(d1);
		System.out.println(d2);
	}

}
