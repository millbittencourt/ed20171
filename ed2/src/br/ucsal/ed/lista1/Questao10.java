package br.ucsal.ed.lista1;

import java.util.Random;

public class Questao10 {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		Integer[] vet = new Integer[10];
		Integer maior = 0;
		Integer menor = 99;

		for (int i = 0; i < vet.length; i++) {
			vet[i] = rd.nextInt(10);
			System.out.print(vet[i] + " ");
			if (vet[i] > maior) {
				maior = vet[i];
			} else if (vet[i] < menor) {
				menor = vet[i];
			}
		}
		System.out.print("\nO maior numero do vetor e: " + maior);
		System.out.print("\nO menor numero do vetor e: " + menor);

	}

}
