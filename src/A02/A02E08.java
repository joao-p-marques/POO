package A02;

import java.util.Scanner;
import static java.lang.System.out;

public class A02E08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		byte n;
		int numberOfOnes=0;
		
		out.print("N:");
		n = sc.nextByte();
		
		do {
			if(n%2==1) numberOfOnes++;
			n = (byte)((int)n/2);
		} while(n!=0);
		
		out.println("Number of ones: " + numberOfOnes);
		
		sc.close();
	}

}
