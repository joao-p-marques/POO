package A10;

import java.util.*;
import java.io.*;

public class A10E01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new FileReader("words.txt"));
		
		Collection<String> words = new HashSet<String>();
		
		//A
		while (input.hasNext()) {
			String word = input.next();
			//System.out.println(word);
			
			//B
			if(word.length()>2) 
				words.add(word);
		}
		//System.out.println();
		
		//System.out.println(words);
		for(String word: words) {
			if(word.endsWith("s"))
				System.out.println(word);
		}
		
		Iterator<String> wordsi = words.iterator();
		while(wordsi.hasNext()) {
			if(!wordsi.next().matches("[a-zA-Z]+")) {
				wordsi.remove();
			}
		}
		System.out.println();
		for(String word: words) {
			if(word.endsWith("s"))
				System.out.println(word);
		}
		
		input.close();
	}

}
