package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroVinteDois {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe o número de votantes: ");
		int totalvotante = valor.nextInt();
		System.out.println("Votante, digite '1' para escolher a candidata Daniela, digite '2' para escolher o candidato Carlos e digite '3' para escolher a candidata Samira.");
		for(int i = 0; i < totalvotante; i++) {
			int voto = valor.nextInt();
			rep.Votacao(totalvotante, voto, i);
		}

	}

}
