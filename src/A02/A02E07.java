package A02;

import static java.lang.System.out;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class A02E07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		double notas[][] = new double[16][2]; //0-notaT 1-notaP
		
		//Ler notas (criar um registo de notas aleatório)
		for(int i=0; i<16; i++) {
//			do {
//				out.print("Nota Teorica: ");
//				notas[i][0] = sc.nextDouble();
//			}while(notas[i][0]<0 || notas[i][0]>20);
//			
//			do {
//				out.print("Nota Pratica: ");
//				notas[i][1] = sc.nextDouble();
//			}while(notas[i][1]<0 || notas[i][1]>20);
			
			notas[i][0] = Math.floor(rand.nextDouble()*21); //VERIFIAR
			notas[i][1] = Math.floor(rand.nextDouble()*21); //VERIFIAR
		}
		
		
		
		//Impressao dos resultados
		out.printf("%s %s %s \n", "NotaT", "NotaP", "Pauta");
		for(int i=0; i<16; i++) {
			if (notas[i][0]<7.0 || notas[i][1]<7.0) {
				out.printf("%5.1f %5.1f %5d \n", notas[i][0], notas[i][1], 66);
			}
			else{
				out.printf("%5.1f %5.1f %5d \n", notas[i][0], notas[i][1], Math.round(0.4*notas[i][0] + 0.6*notas[i][1]));
			}
		}
		
		sc.close();
	}

}
