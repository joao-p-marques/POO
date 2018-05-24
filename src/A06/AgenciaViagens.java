package A06;

import java.util.Arrays;

public class AgenciaViagens {
	private String nome;
	private String endereco;
	private Alojamento[] alojamentos;
	private Carro[] carros;
	private int nAlojamentos, nCarros;
	
	public AgenciaViagens(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		alojamentos = new Alojamento[10];
		carros = new Carro[5];
	}	
	
	public void addAlojamento(Alojamento a) {
		if(nAlojamentos<alojamentos.length) {
			alojamentos[nAlojamentos] = a;
		}
		nAlojamentos++;
	}
	
	public void addCarro(Carro c) {
		if(nCarros<carros.length) {
			carros[nCarros] = c;
		}
		nCarros++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "AgenciaViagens [nome=" + nome + ", endereco=" + endereco + ", alojamentos="
				+ Arrays.toString(alojamentos) + ", carros=" + Arrays.toString(carros) + ", nAlojamentos="
				+ nAlojamentos + ", nCarros=" + nCarros + "]";
	}
}
