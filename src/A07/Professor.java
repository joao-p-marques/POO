package A07;

public class Professor extends Pessoa {
	private String areaInvestigacao;
	
	public Professor(String nome, int cc, int dN, int mN, int aN, String area) {
		super(nome, cc, new Data(dN, mN, aN));
		this.areaInvestigacao = area;
	}

	@Override
	public String toString() {
		return super.toString() + ", Investiga: " + areaInvestigacao;
	}
	
	
}
