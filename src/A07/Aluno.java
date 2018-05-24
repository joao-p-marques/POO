package A07;
import java.util.Calendar;

public class Aluno extends Pessoa {
	private int nMec;
	private Data dataInsc;
	private static int nMecC = 100;
	
	private static Calendar cal = Calendar.getInstance();

	public Aluno(String nome, int cc, int dN, int mN, int aN, int dI, int mI, int aI) {
		super(nome, cc, new Data(dN, mN, aN));
		this.dataInsc = new Data(dI, mI, aI);
		this.nMec = nMecC;
		nMecC++;
	}
	public Aluno(String nome, int cc, int dN, int mN, int aN) {
		super(nome, cc, new Data(dN, mN, aN));
		this.dataInsc = new Data(cal.get(Calendar.DATE), cal.get(Calendar.MONTH), cal.get(Calendar.YEAR));
		this.nMec = nMecC;
		nMecC++;
	}


	public Data getDataInsc() {
		return dataInsc;
	}
	public void setDataInsc(Data dataInsc) {
		this.dataInsc = dataInsc;
	}
	public int getnMec() {
		return nMec;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", NMec: " + nMec + ", DataInsc: " + dataInsc;
	}
	
}
