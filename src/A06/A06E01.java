package A06;
import java.util.Scanner;

import A06.Robo.TipoJogador;
import A06.Bola.TipoCor;

public class A06E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Robo GR1 = new Robo(0, 1, 20, TipoJogador.GuardaRedes, 0);
		Robo D1 = new Robo(1, 0, 30, TipoJogador.Defesa, 1);
		Robo M1 = new Robo(3, 2, 40, TipoJogador.Medio, 2);
		Robo A1 = new Robo(5, 2, 35, TipoJogador.Avancado, 3);
		
		Equipa Equipa1 = new Equipa("RDA", "Gil");
		System.out.println(Equipa1);
		
		Equipa1.adicionarRobo(GR1);
		System.out.println(Equipa1);
		
		Equipa Equipa2 = new Equipa("BARC", "Fernando");
		Equipa2.adicionarRobo(M1);
		
		Bola Bola1 = new Bola(0, 0, 50, TipoCor.Amarela);
		
		Jogo Jogo1 = new Jogo("RDA", "BARC", Bola1);
		
		System.out.println(Jogo1);
		
		Jogo1.golo(Equipa1, Equipa2, GR1);
		
		System.out.println(Equipa1);
		System.out.println(Equipa2);
	}

}
