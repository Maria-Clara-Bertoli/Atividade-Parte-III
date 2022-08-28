package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroDoze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe o intervalo que você deseja obter a sequência de Fibonacci.");
		int intervalo = valor.nextInt();
		rep.Fibonacci(intervalo);
	}

}
