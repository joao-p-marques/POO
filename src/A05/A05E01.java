package A05;

public class A05E01 {

	public static void main(String[] args) {
		Aluno al = new Aluno ("Andreia Melo", 9855678, new Data(18, 7, 1990), new Data (1, 9, 2014));
		Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new Data(11, 5, 1985));
		bls.setBolsa(745);

		System.out.println("Aluno:" + al.getNome());
		System.out.println(al);

		System.out.println("Bolseiro:" + bls.getNome() + ", NMec: " + bls.getnMec() + ", Bolsa:" + bls.getBolsa());
		System.out.println(bls);
	}

}
