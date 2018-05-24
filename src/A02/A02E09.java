package A02;

import java.util.Scanner;
import static java.lang.System.out;

public class A02E09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		byte n;
		//String numberInBin = new String();
		int numberInBin[] = new int[8];
		boolean isNegative=false;
		
		out.print("N: ");
		n = sc.nextByte();
		
		if(n<0) {
			isNegative=true;
			n *= -1;
		}
		
//		do {
//			numberInBin += Integer.toString(n%2);
//			n = (byte)((int)n/2);
//		} while(n!=0);
		
		for(int i=7; i>=0; i--) {
			numberInBin[i] = n%2;
			n = (byte)((int)n/2);
		}
		
		if(isNegative) {
			for(int i=7; i>=0; i--) {
				if(numberInBin[i]==1) {
					for(int j=i-1; j>=0; j--) {
						if(numberInBin[j]==0) numberInBin[j]=1;
						else numberInBin[j]=0;
					}
					break;
				}
			}
		}
		
		out.print("Number in binary: ");
		for(int i=0; i<8; i++) {
			out.print(numberInBin[i]);
		}
		
		sc.close();
	}

}
