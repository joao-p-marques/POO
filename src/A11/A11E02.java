package A11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class A11E02 {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter fw = new PrintWriter("outA11E02.txt");
		
		Localidade cid1 = new Localidade("Szohod", 31212,
		TipoLocalidade.Cidade);
		Localidade cid2 = new Localidade("Wadesdah", 23423,
		TipoLocalidade.Cidade);
		Localidade cid3 = new Localidade("BedRock", 23423,
		TipoLocalidade.Vila);
		
		Estado est1 = new Estado("North Borduria", 223133, cid1);
		Estado est2 = new Estado("South Borduria", 84321, cid2);
		
		Pais p1 = new Pais("Borduria", est1.getCapital());
		Pais p2 = new Pais("Khemed", cid2);
		Pais p3 = new Pais("Aurelia");
		Pais p4 = new Pais("Atlantis");
		
		p1.addRegiao(est1);
		p1.addRegiao(est2);
		p2.addRegiao(new Provincia("Afrinia", 232475, "Aluko Pono"));
		p2.addRegiao(new Provincia("Eriador", 100000, "Dumpgase Liru"));
		p2.addRegiao(new Provincia("Laurania", 30000, "Mukabamba Dabba"));
		
		List<Pais> org = new ArrayList<Pais>();
		org.add(p1);
		org.add(p2);
		org.add(p3);
		org.add(p4);
		
		System.out.println("----Iterar sobre o conjunto");
		
		Iterator<Pais> itr = org.iterator();
		while (itr.hasNext()) {
			Pais temp = itr.next();
			System.out.println(temp);
			fw.println(temp);
		}
		
		System.out.println("-------Iterar sobre o conjunto - For each (java 8)");
		for (Pais pais: org)
			System.out.println(pais);
		
		// ToDo:
		// adicionar (-), remover (-), ordenar (garantido pelo TreeSet), garantir elementos únicos (garantido pelo TreeSet) 
		
		System.out.println("--Após remoção");
		p1.remRegiao(est2);
		System.out.println(p1);
		
		p2.remRegiao(est1);
		System.out.println(p2);
		
		//sort
		System.out.println("--------Sort");
		System.out.println("--Sorted by Pop");
		p1.addRegiao(est2);
		p1.addRegiao(new Estado("Aveiro", 123000, new Localidade("Aveiro", 50000, TipoLocalidade.Cidade)));
		p1.addRegiao(new Estado("Porto", 1000000, new Localidade("Porto", 150000, TipoLocalidade.Cidade)));
		System.out.println(p1.printPais());
		System.out.println("--Sorted by Name");
		System.out.println(p1.sortByName());
		
		
		fw.close();
		
		}

}
