package br.ucsal.ed.avaliacao1.questao1;

import java.util.Scanner;

public class NumerosAmigaveis {

	// 1º) Dois números são considerados AMIGÁVEIS se um deles corresponder
	// à soma dos diversos divisores ( exceto o próprio número )
	// do outro. Por exemplo: vamos analisar os números 8 e 10.
	// Os divisores de 8 são: 1,2 e 4, resultando em soma igual a 7.
	// Já os divisores de 10 são: 1,2 e 5, resultando em soma igual a 8.
	// Assim, como a soma dos divisores de 10 (exceto ele próprio) resulta em 8,
	// pode-se dizer que os números 10 e 8 são amigáveis.
	// Criar um programa que receba dois números inteiros quaisquer e determine
	// se são amigáveis ou não. Fonte 1 (3,0 pontos)

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;

		System.out.println("Olá. Digite dois números, e iremos descobrir se eles são amigáveis ou não.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		descobreNumero(num1, num2);
	}

	private static void descobreNumero(int num1, int num2) {
		int aux = 0;

		System.out.println("Número " + num1);
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				aux = aux + i;
			}
		}
		System.out.print(aux + " é a soma dos divisores de " + num1);
		if (aux == num2) {
			System.out.println("\nOs números são amigáveis! A soma dos divisores de " + num1 + " é " + num2);
		}

		aux = 0;
		System.out.println("\nNúmero " + num2);
		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				aux = aux + i;
			}
		}
		System.out.print(aux + " é a soma dos divisores de " + num2);
		if (aux == num1) {
			System.out.println("\nOs números são amigáveis! A soma dos divisores de " + num2 + " é " + num1);
		}
	}

}
