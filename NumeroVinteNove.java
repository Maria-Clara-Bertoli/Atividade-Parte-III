package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroVinteNove {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe o in�cio databuada: ");
		int inico = valor.nextInt();
		System.out.println("Informe o final databuada: ");
		int fim = valor.nextInt();
		System.out.println("Informe por qual valor a tabuada ser� multiplicada: ");
		int numero = valor.nextInt();
		
		rep.Tabuada(inico, fim, numero);

	}

}
