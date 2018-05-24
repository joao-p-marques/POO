package A07;

public class AlunoPosGrad extends Aluno {
	private Professor orientador;

	public AlunoPosGrad(String nome, int cc, int dN, int mN, int aN, int dI, int mI, int aI, Professor orientador) {
		super(nome, cc, dN, mN, aN, dI, mI, aI);
		this.orientador = orientador;
	}

	@Override
	public String toString() {
		return super.toString() + ", Orientador: " + orientador;
	}
	
		
	
}
