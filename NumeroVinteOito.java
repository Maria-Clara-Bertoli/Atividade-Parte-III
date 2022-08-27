package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroVinteOito {

	public static void main(String[] args) {
		
		int i = 0;
		String condicao = "S";
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe as temperaturas");
		do {
			float temperatura = valor.nextFloat();
			valor.nextLine();
			System.out.println("Digite 'S/N' para continuar ou para parar");
			condicao = valor.nextLine();
			rep.Meteorologia(temperatura, i, condicao);
			i += i;
		}while(!condicao.equalsIgnoreCase("N"));

	}

}
