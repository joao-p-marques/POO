package A07;

public class TestClass123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Classe123 a = new Classe123("joao", 123, new Data(1, 1, 1999), 10);
		Classe123 b = new Classe123("pedro", 12345, new Data(10, 10, 1999), 100);
		
		metodoTeste1(a);
		metodoTeste2(a);
		metodoTeste3(b);
		metodoTeste4(b);
		
		IDemo1 c = new Classe123("abc", 12345, new Data(10, 10, 1999), 101);
		IDemo123 d = new Classe123("pedro", 12345, new Data(10, 10, 1999), 2);
		
		System.out.println(c);
		System.out.println(d);
		
		c.metodo11();
		d.metodo32();
	}
	
	public static void metodoTeste1 (IDemo1 x) {
		System.out.println("Elemento do tipo IDemo1: " + x);
	}
	
	public static void metodoTeste2 (IDemo2 y) {
		System.out.println("Elemento do tipo IDemo2: " + y);
	}
	
	public static void metodoTeste3 (IDemo3 z) {
		System.out.println("Elemento do tipo IDemo3: " + z);
	}

	public static void metodoTeste4 (IDemo123 q) {
		System.out.println("Elemento do tipo IDemo123: " + q);
	}
}
