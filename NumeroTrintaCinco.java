package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroTrintaCinco {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		int encerrar = 1;
		int codigo = 1;
		System.out.println("Informe o código do pedido e a respectiva quantidade. Digite 0 para encerrar ou digite 1 para continuar.");
		System.out.println("-----------------");
		System.out.println("TABELA DE PREÇOS");
		System.out.println("-----------------");
		System.out.println("100 - Cachorro Quente - R$1,20");
		System.out.println("101 - Bauru Simples - R$1,30");
		System.out.println("102 - Bauru Com Ovo - R$1,50");
		System.out.println("103 - Hamburguer - R$1,20");
		System.out.println("104 - Cheeseburguer - R$1,30");
		System.out.println("105 - Refrigerante - R$1,00");
		while (encerrar != 0) {
			System.out.println("Informe o código: ");
			codigo = valor.nextInt();
			System.out.println("Informe a quantidade: ");
			int quantidade = valor.nextInt();
			System.out.println("Deseja encerrar?");
			encerrar = valor.nextInt();
			rep.Lanchonete(codigo, quantidade, encerrar);
			}
		}
	}
