package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroDezesseis {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe uma sequência de números inteiros: ");
		
		int marcador = 1;
		String parar = "";
		do {
			int numero = valor.nextInt();
			valor.nextLine();
			System.out.println("Deseja parar? Digite 'S/N' para 'SIM' ou para 'NÃO'.");
			parar = valor.nextLine();
			rep.Conjunto(numero, marcador, parar);
			marcador += 1;
		}while(!parar.equalsIgnoreCase("S"));
	}

}
