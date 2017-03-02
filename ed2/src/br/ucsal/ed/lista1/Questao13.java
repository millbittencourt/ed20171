package br.ucsal.ed.lista1;

import java.util.Random;
import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		Integer[] surpresa = new Integer[10];
		Integer alea;
		boolean achou = false;

		for (int i = 0; i < surpresa.length; i++) {
			surpresa[i] = rd.nextInt(50);
		}
		System.out.println("Digite um número aleatório. ");
		alea = sc.nextInt();

		for (int i = 0; i < surpresa.length; i++) {
			if (surpresa[i] == alea) {
				System.out.println("Parabéns!! O numero digitado " + alea + " está na posição " + i);
				achou = true;
			}
			System.out.print(surpresa[i] + " ");
		}
		if (!achou) {
			System.out.println("Sorry. Try again. Não existe o numero " + alea + " no vetor.");
		}

	}

}
