package A08;

import java.util.Random;

public enum DiaSemana {
	Segunda, Terça, Quarta, Quinta, Sexta, Sábado, Domingo;

	public static DiaSemana rand() {
		Random r = new Random();
		int i = r.nextInt(7);
		return DiaSemana.values()[i];
	}
}
