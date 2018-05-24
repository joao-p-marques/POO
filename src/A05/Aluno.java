package A05;
import java.util.Calendar;

public class Aluno extends Pessoa {
	private int nMec;
	private Data dataInsc;
	private static int nMecC = 100;
	
	private static Calendar cal = Calendar.getInstance();

	public Aluno(String nome, int cc, Data dataNasc, Data dataInsc) {
		super(nome, cc, dataNasc);
		this.dataInsc = dataInsc;
		this.nMec = nMecC;
		nMecC++;
	}
	public Aluno(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
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
		return super.toString() + ", NMec=" + nMec + ", DataInsc=" + dataInsc;
	}
	
}
