package A03;

import java.util.Scanner;
import static java.lang.System.out;

public class A03E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = new String();
		
		out.print("Texto: ");
		str = sc.nextLine();
		
		out.println();
		//- conte o número de palavras do paragrafo (tenha em consideração os símbolos ‘,’ e ‘ ‘);
		out.println("O texto inserido tem " + nPalavras(str) + " palavras");
		
		//- indique quantas frases tem o parágrafo (uma frase pode acabar com ‘.’, ‘?, ‘...’ ou ‘!’);
		out.println("O texto inserido tem " + nFrases(str) + " frases");
		
		sc.close();
	}
	
	public static int nPalavras(String s) {
		String palavras[] = s.split("[, ]");
		
//		for(String i: palavras) {
//			out.println(i);
//		}
		
		return palavras.length;
	}
	
	public static int nFrases(String s) {
		String frases[] = s.split("[.?!…]");
		
//		for(String i: frases) {
//			out.println(i);
//		}
		
		printFrases(frases);
		return frases.length;
	}
	
	public static void printFrases(String frases[]) {
		for(String i : frases) {
			out.println(i);
		}
	}

}
