package A05;

public class A05E02 {
	
	public static void main(String[] args) {
		
		Circulo c = new Circulo(new Ponto(1, 1), "Vermelho", 3);
		Retangulo r = new Retangulo(new Ponto(0, 2), "Verde", 3, 2);
		Quadrado q = new Quadrado(new Ponto(0, 2), "Verde", 3);
		Quadrado q2 = new Quadrado(new Ponto(3, 2), "Azul", 2);
		
		System.out.println(c);
		System.out.println(r);		
		System.out.println(q);
		
		System.out.println();
		System.out.println(q.equals(q2));
	}
	
}
