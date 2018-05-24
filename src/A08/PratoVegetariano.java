package A08;

public class PratoVegetariano extends Prato{

	public PratoVegetariano(String nome, double maxCalorias) {
		super(nome, maxCalorias);
		// TODO Auto-generated constructor stub
	}
	
	public PratoVegetariano(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void addAlimento(Alimento a) {
		if (a instanceof Vegetariano) super.addIngrediente(a);;
	}
	
	public void removeAlimento(Alimento a) {
		super.removeAlimento(a);
	}
	
}
