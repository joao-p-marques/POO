package A06;
import java.util.Scanner;

import A06.QuartoHotel.TipoQuarto;
import A06.Carro.Combustivel;
import A06.Carro.ClasseCarro;

public class A06E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		AgenciaViagens Ramos= new AgenciaViagens("Agencia Ramos", "Rua Proncipal, 1");
		
		Apartamento Apartamento1 = new Apartamento("Apartamento da Praia", "Praia da Barra", 180, 4.0, 3);
		Apartamento Apartamento2 = new Apartamento("Apartamento da Cidade", "Aveiro", 200, 4.5, 2);
		QuartoHotel Quarto1 = new QuartoHotel("Quarto 1", "Porto", 50, 4.0, TipoQuarto.Single);
		QuartoHotel Quarto2 = new QuartoHotel("Quarto 2", "Lisboa", 60, 4.8, TipoQuarto.Double);
		Carro Smart = new Carro(ClasseCarro.A, Combustivel.Gasolina);
		Carro Coupe = new Carro(ClasseCarro.B, Combustivel.Gasolina);
		Carro Familiar = new Carro(ClasseCarro.C, Combustivel.Diesel);
		
		System.out.println(Ramos);
		
		Ramos.addAlojamento(Apartamento1);
		Ramos.addAlojamento(Quarto2);
		Ramos.addCarro(Smart);
		
		System.out.println(Ramos);
	}

}
