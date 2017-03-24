package q02;

import java.util.Scanner;

public class ApuracaoVestibular {

	private static Scanner sc = new Scanner(System.in);
	private static Integer linha = 3;
	private static Integer coluna = 4;
	private static Aluno[][] alun = new Aluno[linha][coluna];
	private static Integer pontuacao;
	private static Integer codigo;

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		Integer opc;

		System.out.println("\n======== APURA��O VESTIBULAR ==========");
		System.out.println("Cadastre os vestibulandos:\n1. Cadastrar pontua��o em Ciencia da Computa��o;"
				+ "\n2. Cadastrar pontua��o em Engenharia da Computa��o;"
				+ "\n3. Cadastrar pontua��o em An�lise de Sistemas;\n4. Mostrar Aprovados");
		opc = sc.nextInt();

		for (int j = 0; j < coluna; j++) {
			switch (opc) {
			case 1:
				if (alun[opc - 1][j] == null) {
					cadastrar(opc - 1);
					menu();
				} else {
					System.out.println("Lista cheia.");
					menu();
				}
			case 2:
				if (alun[opc - 1][j] == null) {
					cadastrar(opc - 1);
					menu();
				} else {
					System.out.println("Lista cheia.");
					menu();
				}
			case 3:
				if (alun[opc - 1][j] == null) {
					cadastrar(opc - 1);
					menu();
				} else {
					System.out.println("Lista cheia.");
					menu();
				}
			case 4:
				mostrarAprovados();
				System.out.println();
				menu();
			default:
				System.out.println("Digite uma op��o v�lida.");
				menu();
				break;
			}
		}
	}

	private static void cadastrar(Integer opc) {
		for (int j = 0; j < coluna; j++) {
			System.out.println("Digite o c�digo do aluno. ");
			codigo = sc.nextInt();
			System.out.println("Digite a pontuacao do aluno. ");
			pontuacao = sc.nextInt();

			Aluno al = new Aluno();
			al.setCodigo(codigo);
			al.setPontuacao(pontuacao);

			alun[opc][j] = al;
		}
		menu();

	}

	private static void mostrarAprovados() {
		for (int i = 0; i < linha; i++) {
			if (i == 0) {
				System.out.println("\n=== Ci�ncia da computa��o === ");
			} else if (i == 1) {
				System.out.println("\n=== Engenharia da Computa��o === ");
			} else if (i == 2) {
				System.out.println("\n=== An�lise de Sistemas === ");
			}
			for (int j = 0; j < coluna; j++) {
				System.out.print(alun[i][j].toString() + " ");
			}
		}

	}
}
