package A01;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.System.out;

public class A01E07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		out.print("Valor do cateto A: ");
		a = sc.nextDouble();
		out.print("Valor do cateto B: ");
		b = sc.nextDouble();
		
		c = Math.hypot(a, b);
		
		out.println("Valor da hipotenusa: " + c);
		out.println("Valor do ângulo entre A e a hipotenusa: " + Math.toDegrees(Math.acos((a/c))) );
		
		sc.close();
	}

}
