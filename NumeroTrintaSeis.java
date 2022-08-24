package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroTrintaSeis {

	public static void main(String[] args) {

		int voto = 0;

		Scanner valor = new Scanner(System.in);
		
		AtividadeRepeticao rep = new AtividadeRepeticao();

		System.out.println("Vote no seu candidato!");
		do {
			System.out.println("1 - Luisa");
			System.out.println("2 - Mauricio");
			System.out.println("3 - Ana");
			System.out.println("4 - Jose");
			System.out.println("5 - Nulo");
			System.out.println("6 - Branco");
			System.out.println("0 - Encerrar Votação");
			voto = valor.nextInt();
			rep.Votacao(voto);
		} while (voto != 0);

		valor.close();

	}

}
