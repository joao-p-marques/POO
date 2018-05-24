package A02;
import java.util.Scanner;
import static java.lang.System.out;

public class A02E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		boolean isPrime=true;
		
		//Ler e validar
		do {
			out.println("N: ");
			n = sc.nextInt();
		}while(n<=0);
		
		//Verificar
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		
		//Imprimir resultado
		if(isPrime) out.println("O numero e primo.");
		else out.println("O numero nao e primo.");
		
		sc.close();
	}

}
