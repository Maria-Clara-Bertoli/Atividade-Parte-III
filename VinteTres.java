package SobrevivenciaParteIII;

import java.util.Scanner;

public class VinteTres {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe a quantidade de turmas: ");
		int quantidade = valor.nextInt();
		System.out.println("Informe a quantidade de alunos por turma: ");
		int aluno = valor.nextInt();
		if (aluno > 40) {
			while(aluno > 40) {
			System.out.println("Tamanho de turma inválido. Tente novamente! Informe a quantidade de alunos por turma: ");
			aluno = valor.nextInt();
			}	
		}
		rep.MediaAluno(quantidade, aluno);
	}

}
