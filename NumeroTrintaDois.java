package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroTrintaDois {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		AtividadeRepeticao rep = new AtividadeRepeticao();
		System.out.println("Informe o c�digo e a altura dos alunos.");
		for(int i = 1; i <= 10; i++) {
			System.out.println("Aluno " + i);
			System.out.println("C�digo: ");
			int codigo = valor.nextInt();
			System.out.println("Altura: ");
			float altura = valor.nextFloat();
			rep.Altura(altura, codigo, i);
		}

	}

}
