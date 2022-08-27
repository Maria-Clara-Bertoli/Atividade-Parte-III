package SobrevivenciaParteIII;

import java.util.Scanner;

public class NumeroVinteSete {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);

		AtividadeRepeticao rep = new AtividadeRepeticao();
		
		System.out.println("Informe o valor das mercadorias, para encerrar digite '0'.");
		float preco = 1;
		float pagamento = 0;
		while(preco != 0) {
			preco = valor.nextFloat();
			if (preco == 0) {
				System.out.println("Informe o valor do pagamento: ");
				pagamento = valor.nextFloat();
			}
			rep.Caixa(preco, pagamento);
		}

	}

}
