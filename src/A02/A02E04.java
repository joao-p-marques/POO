package A02;
import java.util.Scanner;
import static java.lang.System.out;

public class A02E04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n[] = new int[100];
		int n;
		int first, min, max, sum=0, count=0;
		
		//Ler o 1o valor
		out.print("1: ");
		first = sc.nextInt();
		n = first;
		max = first;
		min = first;
		sum += first;
		count++;
		//Ler os restantes valores
		do {			
			out.print(count+1 + ": ");
			n = sc.nextInt();
			if (n==first) break;
			if(n>max) max=n;
			if(n<min) min=n;
			sum += n;
			count++;
		} while(true);
		
		//Calcular e imprimir resultados
		out.println();
		out.println("Numero Maximo = " + max);
		out.println("Numero Minimo = " + min);
		out.println("Media = " + sum/count);
		out.println("Numero de valores introduzidos = " + count);
		
		sc.close();
	}

}
