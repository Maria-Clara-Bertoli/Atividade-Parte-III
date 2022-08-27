package SobrevivenciaParteIII;

import java.util.Scanner;

public class VinteQuatro {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe quantos CDs você possui: ");
		int quantidadecd = valor.nextInt();
		System.out.println("Informe o valor de seus CDs: ");
		for(int i = 0; i < quantidadecd; i++) {
		float valorcd = valor.nextFloat();
		rep.CD(quantidadecd, valorcd, i);
		}
	}
}
