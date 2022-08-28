package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroVinte {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		float nota = 0;
		System.out.println("Informe as notas do aluno. Digite '-1' para encerrar o programa.");
		do {
			nota = valor.nextFloat();
			rep.MediaNotas(nota);
		}while(nota != -1);

	}

}
