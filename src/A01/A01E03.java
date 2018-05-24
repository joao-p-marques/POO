package A01;
import java.util.Scanner;

public class A01E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double celsius, far;
		
		System.out.print("Insira a temperatura em celsius: ");
		celsius = sc.nextDouble();
		far = 1.8 * celsius + 32;
		System.out.println("A temperatura em farenheit é " + far);
		
		sc.close();
	}

}
