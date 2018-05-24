package A01;
import java.util.Scanner;

public class A01E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double km, miles;
		
		System.out.print("Insira a distancia em km: ");
		km = sc.nextDouble();
		miles = km / 1.609;
		System.out.println("A distância em milhas é " + miles);
		
		sc.close();
	}

}
