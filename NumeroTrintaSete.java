package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroTrintaSete {

	public static void main(String[] args) {

		String vet2[] = new String[10];
		String utiliza = "";
		String a = "N";

		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();

		System.out.println("Informe as possíveis respostas para as questões");
		while (utiliza != a) {
			for (int i = 0; i <= 9; i++) {
				vet2[i] = valor.nextLine();
			}
			System.out.println("Para um novo aluno digite 'S', para encerrar o programa digite 'N'.");
			utiliza = valor.nextLine();
			rep.CorrecaoAutomatica(vet2, utiliza);
		}
	}
}
