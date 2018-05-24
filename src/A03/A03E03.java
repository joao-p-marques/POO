package A03;

import java.util.Scanner;
import static java.lang.System.out;

public class A03E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = readValues();
		int nDays = days(data[0], data[1]);
		int firstDay = data[2];
				
		print(nDays, firstDay);
		
	}
	
	public static int[] readValues() {
		Scanner sc = new Scanner(System.in);
		int values[] = new int[3];
		
		out.print("Mes: ");
		values[0] = sc.nextInt();
		out.print("Ano: ");
		values[1] = sc.nextInt();
		out.print("Dia da semana em que começa: ");
		values[2] = sc.nextInt();
		
		sc.close();
		return values;
	}
	
	public static int days(int month, int year) {
		boolean isLeap=false;
		int numberOfDays;
		
		//Verifivar se o ano e bissexto
		if(year%4==0 && !(year%100==0 && year%400!=0)) {
			isLeap = true;
		}
		
		//Calcular o numero de dias
		switch(month) {
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
		
		return numberOfDays;
	}
	
	public static void print(int nDays, int firstDay) {
		
		String mes[] = new String[42];
		
		for(int i=0; i<firstDay-1; i++) {
			mes[i] = "  ";
		}
		int d = 1;
		for(int i=firstDay-1; i<mes.length; i++) {
			mes[i] = Integer.toString(d);
			d++;
			if(d>nDays) break;
		}
		for(int i=nDays+firstDay-1; i<mes.length; i++) {
			mes[i] = "  ";
		}
		
		
		out.println("-----------------------");
		out.printf("| %2s %2s %2s %2s %2s %2s %2s | \n", "Mo", "Tu", "We", "Th", "Fr", "Sa", "Su");
		out.print("| ");
		for(int i=0; i<mes.length; i++) {
			out.printf("%2s ", mes[i]);
			if((i+1)%7==0) {
				out.println("|");
				if(i+1 >= mes.length) break;
				out.print("| ");
			}
		}		
	}

}
