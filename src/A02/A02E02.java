package A02;
import java.util.Scanner;
import static java.lang.System.out;

public class A02E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		//Ler e validar
		do {
			out.print("N: ");
			n = sc.nextInt();			
		}while(n<=0);
		
		//Imprimir
		for(int i=n; i>=0; i--) {
			out.println(i);
		}
		
		sc.close();
	}

}
