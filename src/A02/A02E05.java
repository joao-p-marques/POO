package A02;
import java.util.Scanner;
import static java.lang.System.out;

public class A02E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mes, ano, numberOfDays;
		boolean isLeap=false;
		
		//Ler a data do utilizador e validar
		do {
			out.print("Mes: ");
			mes = sc.nextInt();
		}while (mes>12 || mes<1);
		do {
			out.print("Ano: ");
			ano = sc.nextInt();
		}while (ano<1);
		
		//Verifivar se o ano e bissexto
		if(ano%4==0 && !(ano%100==0 && ano%400!=0)) {
			isLeap = true;
		}
		
		//Calcular o numero de dias
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numberOfDays = 31;
			break;
		case 2:
			numberOfDays = 28;
			if(isLeap) numberOfDays++;
			break;
		default:
			numberOfDays = 30;
			break;
		}
		
		//Imprimir
		out.println("Numero de dias: " + numberOfDays);
		
		sc.close();
	}

}
