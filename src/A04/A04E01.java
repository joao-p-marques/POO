package A04;

import java.util.Scanner;

public class A04E01 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo c1 = readCirculo();
		Circulo c2 = readCirculo();
		Retangulo r = readRetangulo();
		Quadrado q = readQuadrado();
		
		System.out.println();
		
		System.out.println("Area do circulo 1: " + c1.calcArea());
		System.out.println("Area do circulo 2: " + c2.calcArea());
		System.out.println("Area do retangulo: " + r.calcArea());
		System.out.println("Area do quadrado: " + q.calcArea());
		
		System.out.println("Perimetro do circulo 1: " + c1.calcPer());
		System.out.println("Perimetro do circulo 2: " + c2.calcPer());
		System.out.println("Perimetro do retangulo: " + r.calcPer());
		System.out.println("Perimetro do quadrado: " + q.calcPer());
		
		if(c1.intercept(c2))
			System.out.println("Os circulos intercetam-se.");
		
		sc.close();
	}
	
	public static Circulo readCirculo() {
		
		double temp1, temp2, temp3;
		String cor;
		
		System.out.println("Novo Circulo: ");
		System.out.println("Centro: ");
		System.out.print("x: ");
		temp1 = sc.nextDouble();
		System.out.print("y: ");
		temp2 = sc.nextDouble();
		System.out.print("Raio: ");
		temp3 = sc.nextDouble();
		System.out.print("Cor: ");
		cor = sc.next();
		
		Circulo c = new Circulo(temp1, temp2, temp3, cor);
		
		//sc.close();
		return c;
	}
	
	public static Retangulo readRetangulo() {
		
		double temp1, temp2, temp3, temp4;
		String cor;
		
		System.out.println("Novo Retangulo: ");
		System.out.println("Centro: ");
		System.out.print("x: ");
		temp1 = sc.nextDouble();
		System.out.print("y: ");
		temp2 = sc.nextDouble();
		System.out.print("Lado 1: ");
		temp3 = sc.nextDouble();
		System.out.print("Lado 2: ");
		temp4 = sc.nextDouble();
		System.out.print("Cor: ");
		cor = sc.next();
		
		Retangulo r = new Retangulo(temp1, temp2, temp3, temp4, cor);
		
		//sc.close();
		return r;
	}
	
	public static Quadrado readQuadrado() {
		
		double temp1, temp2, temp3;
		String cor;
		
		System.out.println("Novo Quadrado: ");
		System.out.println("Centro: ");
		System.out.print("x: ");
		temp1 = sc.nextDouble();
		System.out.print("y: ");
		temp2 = sc.nextDouble();
		System.out.print("Lado: ");
		temp3 = sc.nextDouble();
		System.out.print("Cor: ");
		cor = sc.next();
		
		Quadrado q = new Quadrado(temp1, temp2, temp3, cor);
		
		//sc.close();
		return q;
	}

}
