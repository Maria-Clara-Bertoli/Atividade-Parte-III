package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroDezenove {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe um n�mero inteiro para obter os n�meros primos neste intervalo: ");
		int primo = valor.nextInt();
		rep.MostraPrimo(primo);
	}

}
