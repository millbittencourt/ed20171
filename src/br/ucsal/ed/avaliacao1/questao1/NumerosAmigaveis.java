package br.ucsal.ed.avaliacao1.questao1;

import java.util.Scanner;

public class NumerosAmigaveis {

	// 1�) Dois n�meros s�o considerados AMIG�VEIS se um deles corresponder
	// � soma dos diversos divisores ( exceto o pr�prio n�mero )
	// do outro. Por exemplo: vamos analisar os n�meros 8 e 10.
	// Os divisores de 8 s�o: 1,2 e 4, resultando em soma igual a 7.
	// J� os divisores de 10 s�o: 1,2 e 5, resultando em soma igual a 8.
	// Assim, como a soma dos divisores de 10 (exceto ele pr�prio) resulta em 8,
	// pode-se dizer que os n�meros 10 e 8 s�o amig�veis.
	// Criar um programa que receba dois n�meros inteiros quaisquer e determine
	// se s�o amig�veis ou n�o. Fonte 1 (3,0 pontos)

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;

		System.out.println("Ol�. Digite dois n�meros, e iremos descobrir se eles s�o amig�veis ou n�o.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		descobreNumero(num1, num2);
	}

	private static void descobreNumero(int num1, int num2) {
		int aux = 0;

		System.out.println("N�mero " + num1);
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				aux = aux + i;
			}
		}
		System.out.print(aux + " � a soma dos divisores de " + num1);
		if (aux == num2) {
			System.out.println("\nOs n�meros s�o amig�veis! A soma dos divisores de " + num1 + " � " + num2);
		}

		aux = 0;
		System.out.println("\nN�mero " + num2);
		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				aux = aux + i;
			}
		}
		System.out.print(aux + " � a soma dos divisores de " + num2);
		if (aux == num1) {
			System.out.println("\nOs n�meros s�o amig�veis! A soma dos divisores de " + num2 + " � " + num1);
		}
	}

}
