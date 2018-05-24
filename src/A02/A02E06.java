package A02;
import java.util.Scanner;
import java.util.Random;
import java.lang.String;
import static java.lang.System.out;

public class A02E06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberToGuess, playerGuess, guesses=0;
		//String playerAnswer = new String();
		String playerAnswer = new String();
		Random rand = new Random();
		//out.println("Correct Answer: " + numberToGuess);
		
		do { //Loop sobre o jogo
			numberToGuess = rand.nextInt(100) + 1; //Gerar numero entre 1 e 100
 			do { //Loop no jogo para as adivinhas
				out.print("Guess: ");
				playerGuess = sc.nextInt();
				guesses++;
				if(playerGuess > numberToGuess) {
					out.println("Too Hight!");
				}
				else if(playerGuess < numberToGuess) {
					out.println("Too Low!");
				}
				else {
					out.println("Correct in " + guesses + " guesses!");
				}
			}while(playerGuess != numberToGuess);
 			
 			out.print("Novo Jogo? (sim/nao) ");
 			playerAnswer = sc.next();
		}while(playerAnswer.equals("sim"));
		
		sc.close();
	}

}
