package A02;

import java.util.Scanner;
import java.lang.Math;
import static java.lang.System.out;

public class A02E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
	
		do {
			out.print("Nota Teorica: ");
			aluno.notaT = sc.nextDouble();
		}while(aluno.notaT<0 || aluno.notaT>20);
		
		do {
			out.print("Nota Pratica: ");
			aluno.notaP = sc.nextDouble();
		}while(aluno.notaP<0 || aluno.notaP>20);
		
		if (aluno.notaP<7.0 || aluno.notaT<7.0) {
			out.println(66);
		}
		else{
			out.println(Math.round(0.4*aluno.notaT + 0.6*aluno.notaP));
		}
		
		sc.close();
	}

}
