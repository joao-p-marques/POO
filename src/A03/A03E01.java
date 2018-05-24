package A03;

import java.util.Scanner;
import static java.lang.System.out;

public class A03E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String read[] = new String[2];
		
		//Ler 2 strings
		out.print("Texto 1: ");
		read[0] = sc.nextLine();
		out.print("Texto 2: ");
		read[1] = sc.nextLine();
		
		//- imprimir número total de carateres em ambas as Strings;
		out.println();
		out.println("A string 1 tem " + read[0].length() + " caracteres");
		out.println("A string 2 tem " + read[1].length() + " caracteres");
		
		//- imprimir o último carater da primeira String;
		out.println("O último caracter da 1a string é " + read[0].charAt(read[0].length()-1));
		
		//- indicar se as duas Strings são iguais;
		if(read[0].equals(read[1])) {
			out.println("As duas strings são iguais");
		}
		else {
			out.println("As duas strings não são iguais");
		}
		
		//- indicar se a segunda String acaba com “.” (ponto);
		if(read[1].endsWith(".")) {
			out.println("A string 2 acaba com '.'");
		}
		
		//- indicar se a segunda String só tem minúsculas;
		if(read[1].equals(read[1].toLowerCase())) {
			out.println("A string 2 só tem minusculas");
		}
		
		//- converter todos os carateres ds Strings para minúsculas e imprimir o resultado;
		out.println();
		out.println("1 (min): " + read[0].toLowerCase());
		out.println("2 (min): " + read[1].toLowerCase());
		
		//- substituir todas as ocorrências de vários espaços seguidos por um único espaço;
		out.println("1 (rep): " + read[0].replaceAll("\\s+", " "));
		out.println("2 (rep): " + read[1].replaceAll("\\s+", " "));
		
		//- capitalize a primeira letra de cada palavra de ambas as frases;
		out.println("1 (cap): " + capStr(read[0]));
		out.println("2 (cap): " + capStr(read[1]));		
		
		//- indique se cada String é um palíndromo ou não
		if(isPali(read[0]))
			out.println("A string 1 é palindromo");
		else
			out.println("A string 1 não é palindromo");
		if(isPali(read[1]))
			out.println("A string 2 é palindromo");
		else
			out.println("A string 2 não é palindromo");
		
		sc.close();
	}
	
	public static boolean isPali(String s) {
		String revStr = "";
		for(int i=s.length()-1; i>=0; i--) {
			revStr += Character.toString(s.charAt(i));
		}
		if(revStr.equals(s)) {
			return true;
		}
		return false;
	}
	
	public static String capStr(String s) {
		String newStr = "";
		for(int j=0; j<s.length(); j++) {
			if(j==0 || s.charAt(j-1)==' ') {
				newStr += Character.toString(s.charAt(j)).toUpperCase();
				continue;
			}
			newStr += Character.toString(s.charAt(j));
		}
		return newStr;
	}

}
