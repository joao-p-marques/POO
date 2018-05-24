package A01;
import java.util.Scanner;
import java.lang.Math;

public class A01E06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		
		System.out.print("Ponto 1 (x):");
		p1.x = sc.nextInt();
		System.out.print("Ponto 1 (y):");
		p1.y = sc.nextInt();
		System.out.print("Ponto 2 (x):");
		p2.x = sc.nextInt();
		System.out.print("Ponto 2 (y):");
		p2.y = sc.nextInt();
		
		System.out.println("Dintância entre os dois pontos: " + Math.sqrt( Math.pow((p1.x-p2.x), 2) + Math.pow((p1.y-p2.y), 2)));
		
		sc.close();
	}

}
