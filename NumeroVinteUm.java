package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroVinteUm {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		String condicao = "";
		int idade = 0;
		do {
		System.out.println("Informe a sua idade: ");
		idade = valor.nextInt();
		valor.nextLine();
		System.out.println("Deseja encerrar? Informe 'S/N' para 'Sim' ou para 'Não'.");
		condicao = valor.nextLine();
		rep.VerificaFaixaEtaria(idade, condicao);
		}while(!condicao.equalsIgnoreCase("N"));

	}

}
