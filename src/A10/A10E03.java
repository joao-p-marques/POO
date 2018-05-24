package A10;

import java.io.*;
import java.util.*;

public class A10E03{
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new FileReader("companhias.txt"));
		
		List<Voo> voos = new ArrayList<>();
		Set<Companhia> companhias = new HashSet<>();
		List<Cidade> cidades = new ArrayList<>();
		
		while(input.hasNext()) {
			String line = input.nextLine();
			String[] data = line.split("\t"); //Split by TAB
			
			if(data[0].equals("Sigla")) continue;
			
			companhias.add(new Companhia(data[0], data[1]));			
		}
		
		input.close();
		
		input = new Scanner(new FileReader("voos.txt"));
		
		
		while(input.hasNext()) {
			String line = input.nextLine();
			String[] data = line.split("\t"); //Split by TAB
			
			if(data[0].equals("Hora")) continue;
			
			//System.out.println(Arrays.toString(data));
			
			
			Cidade cidade = new Cidade(data[2]);
			if(!cidades.contains(cidade)) cidades.add(cidade);
//				
//			}else {
//				cidades.add(cidade);
//				cidade.addVoo();
//			}
			
			if(data.length==4) {			
				voos.add(new Voo(new Hora(Integer.parseInt(data[0].split(":")[0]), Integer.parseInt(data[0].split(":")[1])), data[1], cidade, new Hora(Integer.parseInt(data[3].split(":")[0]), Integer.parseInt(data[3].split(":")[1]))));
			}
			else {
				voos.add(new Voo(new Hora(Integer.parseInt(data[0].split(":")[0]), Integer.parseInt(data[0].split(":")[1])), data[1], cidade));
			}
			//System.out.println(voos.get(voos.size()-1));
			
			Voo thisVoo = voos.get(voos.size()-1);
			
			thisVoo.setCompanhia(companhias);
			
			thisVoo.setObs("Previsto: " + Hora.addHora(thisVoo.getHora(), thisVoo.getAtraso()));
			
			//System.out.println(voos.get(voos.size()-1));
		}
		
		input.close();
		
		for(Voo voo : voos) {
			if(voo.getCompanhia() == null) continue;
			for(Companhia companhia : companhias) {
				if(voo.getCompanhia().equals(companhia)) {
					companhia.addVoo(voo);
					break;
				}
			}
		}
		
		PrintWriter out = new PrintWriter("outA10E03.txt");
		
		out.printf("%-7s %-10s %-20s %-23s %-8s %-15s \n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
		
		for(Voo voo : voos) {
			//System.out.println(voo);
			if(voo.getCompanhia()==null) {
				out.printf("%-7s %-10s %-20s %-23s %-8s %-15s \n", voo.getHora(), voo.getNome(), "null", voo.getOrigem(), voo.getAtraso(), voo.getObs());
				continue;
			}
			out.printf("%-7s %-10s %-20s %-23s %-8s %-15s \n", voo.getHora(), voo.getNome(), voo.getCompanhia().getNome(), voo.getOrigem(), voo.getAtraso(), voo.getObs());
		}
		
		out.close();
		
		List<AtrasosCompanhia> mediasAtrasos = new ArrayList<>();
		
		for(Companhia companhia : companhias) {
			mediasAtrasos.add(new AtrasosCompanhia(companhia, companhia.calcMediaAtraso()));
		}
		
		Collections.sort(mediasAtrasos, new Comparator<AtrasosCompanhia>() {

			@Override
			public int compare(AtrasosCompanhia arg0, AtrasosCompanhia arg1) {
				return arg0.getAtraso().compareTo(arg1.getAtraso());
			}
			
		});	
		
		
		System.out.printf("%-8s %-20s %-15s \n", "Sigla", "Nome", "Media Atraso");
		for(AtrasosCompanhia companhia : mediasAtrasos) {
			System.out.printf("%-8s %-20s %-15s \n", companhia.getCompanhia().getSigla(), companhia.getCompanhia().getNome(), companhia.getAtraso());
		}
		
		out = new PrintWriter("outA10E03b.txt");
		
		out.printf("%-20s %-15s \n", "Origem", "Voos");
		
		for(Cidade cidade : cidades) {
			for(Voo voo : voos) {
				if(voo.getOrigem().equals(cidade)) cidade.addVoo();
			}
		}
		
		Collections.sort(cidades, new Comparator<Cidade>(){

			@Override
			public int compare(Cidade arg0, Cidade arg1) {
				return arg1.getVoos()-arg0.getVoos();
			}
			
		});
		for(Cidade cidade : cidades) {
			out.printf("%-20s %-15s \n", cidade.getNome(), cidade.getVoos());
		}
		
		out.close();
		
		
	}
	
}


