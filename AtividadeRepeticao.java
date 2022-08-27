package SobrevivenciaParteIII;

import java.util.ArrayList;

public class AtividadeRepeticao {

	private int luisa;
	private int mauricio;
	private int ana;
	private int jose;
	private int nulo;
	private int branco;
	private float porcentagemnulo;
	private float porcentagembranco;
	private float totalvoto;
	private String vet[] = new String[10];
	private int nota;
	private int totalnota;
	private int totalaluno;
	private float medianota;
	private int maiornota = 0;
	private int menornota = 10;
	private String a = "N";
	private float cem;
	private float cemsoma;
	private float centoum;
	private float centoumsoma;
	private float centodois;
	private float centodoissoma;
	private float centotres;
	private float centotressoma;
	private float centoquatro;
	private float centoquatrosoma;
	private float centocinco;
	private float centocincosoma;
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private float maioraltura = 0;
	private int codigomaioraltura;
	private float menoraltura = 500;
	private int codigomenoraltura;
	private float alto = 0;
	private float baixo = 1000;
	private float magro = 5000;
	private float gordo = 0;
	private int codigoalunoalto;
	private int codigoalunobaixo;
	private int codigoalunogordo;
	private int codigoalunomagro;
	private int aux;
	private float maiortemperatura;
	private float menortemperatura;
	private float somatemperatura;
	private float somapreco;
	private float troco;
	ArrayList<Float> list = new ArrayList();
	int i = 1;
	private float precotabela = 1.99f;
	private float somacd;
	private float mediacd;
	private float mediaaluno;
	private int daniela;
	private int carlos;
	private int samira;

	public void Votacao(int voto) {
		if (voto == 1) {
			luisa = luisa + 1;
		} else if (voto == 2) {
			mauricio = mauricio + 1;
		} else if (voto == 3) {
			ana = ana + 1;
		} else if (voto == 4) {
			jose = jose + 1;
		} else if (voto == 5) {
			nulo = nulo + 1;
		} else if (voto == 6) {
			branco = branco + 1;
		} else if (voto == 0) {
			totalvoto = luisa + mauricio + ana + jose + nulo + branco;
			porcentagemnulo = nulo / (totalvoto / 100);
			porcentagembranco = branco / (totalvoto / 100);
			System.out.println("----------------");
			System.out.println("TOTAL DE VOTOS");
			System.out.println("----------------");
			System.out.println("Luisa: " + luisa + " voto(s)");
			System.out.println("Mauricio: " + mauricio + " voto(s)");
			System.out.println("Ana: " + ana + " voto(s)");
			System.out.println("Jose: " + jose + " voto(s)");
			System.out.println("Branco(s): " + branco + " voto(s)");
			System.out.println("Nulo(s): " + nulo + " voto(s)");
			System.out.println("Total de votos: " + totalvoto);
			System.out.println("Porcentagem de votos brancos sobre o total de votos: " + porcentagembranco);
			System.out.println("Porcentagem de votos nulos sobre o total de votos: " + porcentagemnulo);
		}
	}

	public void CorrecaoAutomatica(String vet2[], String utiliza) {
		vet[0] = "A";
		vet[1] = "B";
		vet[2] = "C";
		vet[3] = "D";
		vet[4] = "E";
		vet[5] = "E";
		vet[6] = "D";
		vet[7] = "C";
		vet[8] = "B";
		vet[9] = "A";

		for (int i = 0; i <= 9; i++) {
			if (vet2[i].equals(vet[i]))
				nota = nota + 1;
		}
		if (nota > maiornota) {
			maiornota = nota;
		}
		if (nota < menornota) {
			menornota = nota;
		}
		totalaluno = totalaluno + 1;
		totalnota = totalnota + nota;
		nota = 0;

		if (utiliza.equals(a)) {
			medianota = totalnota / totalaluno;
			System.out.println("---------------------");
			System.out.println("AVALIAÇÃO CONCLUÍDA!");
			System.out.println("---------------------");
			System.out.println("Total alunos: " + totalaluno);
			System.out.println("Total de notas: " + totalnota);
			System.out.println("Média de notas: " + medianota);
			System.out.println("Maior acerto: " + maiornota);
			System.out.println("Menor acerto: " + menornota);
		}
	}

	public void Lanchonete(int codigo, int quantidade, int encerrar) {
		if (codigo == 100) {
			cem = quantidade * 1.20f;
			cemsoma = cemsoma + cem;
		} else if (codigo == 101) {
			centoum = quantidade * 1.30f;
			centoumsoma = centoumsoma + centoum;
		} else if (codigo == 102) {
			centodois = quantidade * 1.50f;
			centodoissoma = centodoissoma + centodois;
		} else if (codigo == 103) {
			centotres = quantidade * 1.20f;
			centotressoma = centotressoma + centotres;
		} else if (codigo == 104) {
			centoquatro = quantidade * 1.30f;
			centoquatrosoma = centoquatrosoma + centoquatro;
		} else if (codigo == 105) {
			centocinco = quantidade * 1f;
			centocincosoma = centocincosoma + centocinco;
		}
		if (encerrar == 0) {
			System.out.println("-----------------");
			System.out.println("CUMPOM DO PEDIDO");
			System.out.println("-----------------");
			System.out.println("Cachorro Quente: " + cemsoma);
			System.out.println("Bauru Simples: " + centoumsoma);
			System.out.println("Bauru Com Ovo: " + centodoissoma);
			System.out.println("Hamburguer: " + centotressoma);
			System.out.println("Cheeseburguer: " + centoquatrosoma);
			System.out.println("Refrigerante: " + centocincosoma);
			System.out.println("Total: "
					+ (cemsoma + centoumsoma + centodoissoma + centotressoma + centoquatrosoma + centocincosoma));
		}
	}

	public void VerificaIntervalo(int numero) {
		if (numero >= 0 && numero <= 25) {
			count1 = count1 + 1;
		} else if (numero >= 26 && numero <= 50) {
			count2 = count2 + 1;
		} else if (numero >= 51 && numero <= 75) {
			count3 = count3 + 1;
		} else if (numero >= 76 && numero <= 100) {
			count4 = count4 + 1;
		} else if (numero < 0) {
			System.out.println("Intervalo de 0 à 25: " + count1);
			System.out.println("Intervalo de 26 à 50: " + count2);
			System.out.println("Intervalo de 51 à 75: " + count3);
			System.out.println("Intervalo de 76 à 100: " + count4);
		}
	}

	public void Altura(float altura, int codigo, int i) {
		if (altura > maioraltura) {
			maioraltura = altura;
			codigomaioraltura = codigo;
		}
		if (altura < menoraltura) {
			menoraltura = altura;
			codigomenoraltura = codigo;
		}
		if (i == 10) {
			System.out.println("Maior altura e respectivo código: " + maioraltura + ", " + codigomaioraltura);
			System.out.println("Menor altura e respectivo código: " + menoraltura + ", " + codigomenoraltura);
		}
	}

	public void AvaliacaoAluno(int codigo, float peso, float altura, int numero) {
		if (peso > gordo) {
			gordo = peso;
			codigoalunogordo = codigo;
		}
		if (peso < magro) {
			magro = peso;
			codigoalunomagro = codigo;
		}
		if (altura > alto) {
			alto = altura;
			codigoalunoalto = codigo;
		}
		if (altura < baixo) {
			baixo = altura;
			codigoalunobaixo = codigo;
		}
		if (numero == 0) {
			System.out.println("Aluno mais alto - " + alto + " - Código: " + codigoalunoalto);
			System.out.println("Aluno mais baixo - " + baixo + " - Código: " + codigoalunobaixo);
			System.out.println("Aluno mais gordo - " + gordo + " - Código: " + codigoalunogordo);
			System.out.println("Aluno mais alto - " + magro + " - Código: " + codigoalunomagro);
		}
	}

	public void Tabuada(int inicio, int fim, int valor) {
		if (inicio > fim) {
			aux = inicio;
			inicio = fim;
			fim = aux;
		}
		for (int i = inicio; i <= fim; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
		}
	}

	public void Meteorologia(float temperatura, int i, String condicao) {
		somatemperatura += temperatura;
		if (i == 0) {
			maiortemperatura = temperatura;
			menortemperatura = temperatura;
		} else {
			if (temperatura > maiortemperatura) {
				maiortemperatura = temperatura;
			}
			if (temperatura < menortemperatura) {
				menortemperatura = temperatura;
			}
		}
		if (condicao.equalsIgnoreCase("N")) {
			System.out.println("A maior temperatura é: " + maiortemperatura);
			System.out.println("A menor teperatura é: " + menortemperatura);
			System.out.println("A soma é: " + somatemperatura);
		}
	}

	public void Caixa(float preco, float pagamento) {
		if (preco != 0) {
			somapreco += preco;
			list.add(preco);
		} else {
			for (float n : list) {
				System.out.println("Produto " + i + ": R$" + n);
				i += 1;
			}
			if (pagamento > somapreco) {
				troco = pagamento - somapreco;
				System.out.println("Total: R$" + somapreco);
				System.out.println("Dinheiro: R$" + pagamento);
				System.out.println("Troco: R$" + troco);
			} else {
				System.out.println("Total: R$" + somapreco);
				System.out.println("Dinheiro: R$" + pagamento);
				System.out.println("Troco: R$0");
				if (pagamento < somapreco) {
					System.out.println("Faltou dinheiro!");
				}
			}
		}
	}

	public void TabelaPrecos() {
		System.out.println("-----------------");
		System.out.println("TABELA DE PREÇOS");
		System.out.println("-----------------");
		for (int i = 1; i <= 50; i++) {
			System.out.println(String.format(i + " - R$" + "%.2f", precotabela));
			precotabela += 1.99f;
		}
	}

	public void CD(int quantidadecd, float valorcd, int n) {
		somacd = somacd + valorcd;
		mediacd = somacd / (float) quantidadecd;
		if (n == 4) {
			System.out.println("Valor investido: " + somacd);
			System.out.println("Valor médio por CD: " + mediacd);
		}
	}
	
	public void MediaAluno(int quantidade, int aluno) {
		mediaaluno = (float)aluno/(float)quantidade;
		System.out.println("Média de alunos por turma: " + mediaaluno);
	}
	
	public void Votacao(int totalvotante, int voto, int i) {
		if(voto == 1) {
			daniela += 1;
		}
		else if(voto == 2) {
			carlos += 1;
		}
		else if(voto == 3) {
			samira += 1;
		}
		else {
			System.out.println("Voto inválido!");
		}
		if (i == (totalvotante - 1)) {
			System.out.println("---------------");
			System.out.println("TOTAL DE VOTOS");
			System.out.println("---------------");
			System.out.println("Daniela: " + daniela);
			System.out.println("Samira: " + samira);
			System.out.println("Carlos: " + carlos);
		}
	}
}
