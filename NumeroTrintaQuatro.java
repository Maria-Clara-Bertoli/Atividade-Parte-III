package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroTrintaQuatro {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		int numero = 0;
		do {
			System.out.println("Informe n�meros positivos. Para parar informe um n�mero negativo");
			numero = valor.nextInt();
			rep.VerificaIntervalo(numero);
		}while(numero >= 0);

	}

}
