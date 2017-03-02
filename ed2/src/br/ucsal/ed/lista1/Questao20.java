package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao20 {

	// ordem crescente de notas;
	public static void main(String[] args) {
		int[] notasEnem = pegarnotasDoEnem();
		notasEnemDecrescente(notasEnem);
	}

	public static int[] pegarnotasDoEnem() {
		Scanner sc = new Scanner(System.in);

		int[] notasEnem = new int[5];

		System.out.println("Digite as 10 maiores pontuações do enem. ");
		for (int i = 0; i < notasEnem.length; i++) {
			notasEnem[i] = sc.nextInt();
		}

		return notasEnem;
	}

	private static int notasEnemDecrescente(int[] notasEnem) {
		int maior = 0;
		for (int i = 0; i < notasEnem.length; i++) {

			if (notasEnem[i] > maior) {
				maior = notasEnem[i];
				System.out.println("Registrar " + maior + " na posição " + i);
			}
		}
		return maior;
	}

}
