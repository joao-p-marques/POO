package A01;
import java.util.Scanner;

public class A01E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira tempo em segundos: ");
		int s, m, h;
		s = sc.nextInt();
		
		m = s / 60;
		s = s % 60;
		h = m / 60;
		m = m % 60;
		
		System.out.println(h + ":" + m + ":" + s);
		
		sc.close();
	}

}
