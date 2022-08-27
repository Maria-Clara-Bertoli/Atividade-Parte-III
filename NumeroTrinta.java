package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroTrinta {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		int numero = 1;
		do {
			System.out.println("Informe o código do aluno: ");
			int codigo = valor.nextInt();
			System.out.println("Informe o peso do aluno: ");
			float peso = valor.nextFloat();
			System.out.println("Informe a altura do aluno: ");
			float altura = valor.nextFloat();
			System.out.println("Para encerrar o programa digite '0', para continuar digite '1'.");
			numero = valor.nextInt();
			rep.AvaliacaoAluno(codigo, peso, altura, numero);
		}while(numero != 0);
		
		valor.close();

	}

}
