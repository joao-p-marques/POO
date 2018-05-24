package A10;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class A10E02 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		ArrayList<String> leitura = new ArrayList<String>();
		Map<String, Map<String, Integer>> palavras = new TreeMap<String, Map<String, Integer>>();
		
		Scanner input = new Scanner(new FileReader("words.txt"));
		//input.useDelimiter("[\\t\\n.,:''`;?!-*{}=+&/()\\\"\\']"); //'‘’;?!-*{}=+&/()[]”“\\\"\\']");
		while(input.hasNext()) {
			String word = input.next();
			
			if (word.length()>2) {
				leitura.add(word);
			}
		}
		
		for(int i=0; i<leitura.size()-1; i++) {
			String word = leitura.get(i);
			String nextWord = leitura.get(i+1);
			if (palavras.containsKey(word)) {
				if(palavras.get(word).containsKey(nextWord)) {
					palavras.get(word).put(nextWord, palavras.get(word).get(nextWord)+1);
				}
				else {
					palavras.get(word).put(nextWord, 1);
				}
			}
			else {
				palavras.put(word, new HashMap<String, Integer>());
				palavras.get(word).put(nextWord, 1);
			}
		}
		
		System.out.println(palavras);
		input.close();
	}

}









