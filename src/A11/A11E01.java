package A11;

import java.util.*;
import java.io.*;

public class A11E01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new FileReader("viaturas.csv"));
		
		List<Veiculo> lista = new ArrayList<Veiculo>(); 
		
		while(input.hasNext()) {
			String line = input.nextLine();
			String[] data = line.split("[;]");
			
			switch (data[0]) {
			case "CarroHibrido":
				lista.add(new AutomovelHibrido(data[1], Integer.parseInt(data[3]), Cor.valueOf(data[2]), Integer.parseInt(data[4]), Double.parseDouble(data[6]), Double.parseDouble(data[5])));
				break;
			case "CarroEletrico":
				lista.add(new AutomovelEletrico(data[1], Integer.parseInt(data[3]), Cor.valueOf(data[2]), Integer.parseInt(data[4]), Double.parseDouble(data[5])));
				break;
			case "CarroCombustao":
				lista.add(new AutomovelPropulosao(data[1], Integer.parseInt(data[3]), Cor.valueOf(data[2]), Integer.parseInt(data[4]), Double.parseDouble(data[5])));
				break;
			case "MotoEletrica":
				lista.add(new MotoEletrica(data[1], Integer.parseInt(data[3]), Cor.valueOf(data[2]), Integer.parseInt(data[4])));
				break;
			case "MotoCombustao":
				lista.add(new MotoPropulsao(data[1], Integer.parseInt(data[3]), Cor.valueOf(data[2]), Integer.parseInt(data[4])));
				break;
			case "Bicicleta":
				lista.add(new Bicicleta(data[1], Integer.parseInt(data[3]), Cor.valueOf(data[2])));
				break;
			}	
		}
		
		input.close();
		
		PrintWriter output = new PrintWriter("outA11E01.txt");
		
		Collections.sort(lista, new Comparator<Veiculo>() {
			@Override
			public int compare(Veiculo arg0, Veiculo arg1) {
				//System.out.println(arg0.getMatricula() + ", " + arg1.getMatricula() + ": " + arg0.getMatricula().compareTo(arg1.getMatricula()));
				return arg0.getMatricula().compareTo(arg1.getMatricula());
			}			
		});
		
		//System.out.println();
		for(Veiculo veiculo : lista) {
			output.println(veiculo);
		}
		
		output.close();
		
		Collections.sort(lista, new Comparator<Veiculo>() {
			@Override
			public int compare(Veiculo arg0, Veiculo arg1) {
				return arg0.getClass().getName().compareTo(arg1.getClass().getName());
			}			
		});
		
		for(Veiculo veiculo : lista) {
			System.out.println(veiculo);
		}
	}

}
