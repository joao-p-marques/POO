package A01;
import java.util.Scanner;

public class A01E04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double v1, v2;
		
		System.out.print("Insira a velocidade no primeiro percurso:");
		v1 = sc.nextDouble();
		System.out.print("Insira a velocidade no segundo percurso:");
		v2 = sc.nextDouble();
		
		System.out.println("A velocidade média foi " + ((v1+v2)/2));
		
		sc.close();
	}
}
