package A11;

public class Estado extends Regiao {
	private Localidade capital;
	
	public Estado(String nome, int populacao, Localidade capital) {
		super.setNome(nome);
		super.setPopulacao(populacao);
		if(capital.getTipo() != TipoLocalidade.Cidade) {
			System.out.println("A capital de uma região deve ser uma cidade!");
			return;
		}
		this.setCapital(capital);
	}
	
	public Localidade getCapital() {
		return capital;
	}
	public void setCapital(Localidade capital) {
		this.capital = capital;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		return true;
	}
	
}
