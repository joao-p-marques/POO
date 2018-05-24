package A09;

import java.util.*;

public class A09E02a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> nomesBB = new ArrayList<String>();
		
		String nome1 = "João";
		String nome2 = "Pedro";
		String nome3 = "André";
		nomesBB.add(nome1);
		nomesBB.add(nome2);
		nomesBB.add(nome3);
		System.out.println("1.1) " + nomesBB);
		nomesBB.remove(nome2);
		System.out.println("1.2) " + nomesBB);		
		
		
		Map<Funcionario, Brinquedo> paresFB = new HashMap<Funcionario, Brinquedo>();
		
		Funcionario f1 = new Funcionario(nome1);
		Funcionario f2 = new Funcionario(nome2);
		Funcionario f3 = new Funcionario(nome3);
		Brinquedo b1 = new Brinquedo("carro");
		Brinquedo b2 = new Brinquedo("bola");
		Brinquedo b3 = new Brinquedo("comboio");
		paresFB.put(f1,  b1);
		paresFB.put(f2,  b2);
		paresFB.put(f3,  b3);
		System.out.println("2.1) " + paresFB);
		paresFB.remove(f2);
		System.out.println("2.2) " + paresFB);
		
		
		Collection<String> nomes = new HashSet<String>();
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add(nome3);
		System.out.println("3.1) " + nomes);
		nomes.add(nome1); //nao ha repetiçao
		System.out.println("3.2) " + nomes);
		nomes.remove(nome3);
		System.out.println("3.3) " + nomes);
		
		
		Map<String, Integer> nomesPopulares = new HashMap<String, Integer>();
		
		nomesPopulares.put(nome1, 3);
		nomesPopulares.put(nome2, 1);
		nomesPopulares.put(nome3, 2);
		System.out.println("4.1) " + nomesPopulares);
		nomesPopulares.remove(nome2);
		System.out.println("4.2) " + nomesPopulares);
		
		
		Collection<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		System.out.println("5.1) " + funcionarios);
		funcionarios.remove(f2);
		System.out.println("5.2) " + funcionarios);
	}
}
