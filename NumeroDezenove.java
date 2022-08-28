package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroDezenove {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe um número inteiro para obter os números primos neste intervalo: ");
		int primo = valor.nextInt();
		rep.MostraPrimo(primo);
	}

}
