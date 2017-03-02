package br.ucsal.ed.lista1;

import java.util.Random;

public class Questao19 {
//	package lista01;
//
//	import java.util.Random;
//
//	public class Questao19 {
//
//		public static void main(String[] args) {
//			Random rd = new Random();
//
//			double[] vet = new double[20];
//
//			for (int i = 0; i < vet.length; i++) {
//				vet[i] = rd.nextInt(10);
//				System.out.print(vet[i] + " ");
//			}
//
//			calcularFatorial(vet);
//			System.out.println();
//			primoOuNot(vet);
//			System.out.println();
//			maiorOuMenor(vet);
//		}
//
//		public static void calcularFatorial(double[] vet) {
//			double fat = 1;
//			for (int i = 0; i < vet.length; i++) {
//				for (int j = 1; j <= vet[i]; j++) {
//					fat = fat * j;
//				}
//				System.out.println();
//				System.out.print("O fatorial de " + vet[i] + " é " + fat);
//				fat = 1;
//			}
//		}
//
//		public static void primoOuNot(double vet[]) {
//			for (int i = 0; i < vet.length; i++) {
//				boolean primo = true;
//				for (int j = 2; j < vet[i]; j++) {
//					if (vet[i] % j == 0) {
//						primo = false;
//						break;
//					}
//				}
//				if (primo == true) {
//					System.out.println(vet[i] + " é primo. Posição no vetor: " + i);
//				}
//			}
//		}
//
//		public static void maiorOuMenor(double vet[]) {
//			Double maior = 0d;
//			Double menor = 99d;
//			for (int i = 0; i < vet.length; i++) {
//				if (vet[i] > maior) {
//					maior = vet[i];
//				} else if (vet[i] < menor) {
//					menor = vet[i];
//				}
//			}
//			System.out.println("O maior número do vetor é: " + maior);
//			System.out.println("O menor número do vetor é: " + menor);
//
//		}
//	}

	public static void main(String[] args) {
		Random rd = new Random();

		int[] vetor = new int[5];

		System.out.println("O vetor é: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(10);
			System.out.print(vetor[i] + " ");
		}
		fatorial(vetor);
		primoOuNao(vetor);
		maiorEMenor(vetor);

	}

	public static void fatorial(int[] vetor) {
		int fat = 0;
		System.out.println("\nO fatorial de cada elemento desse vetor é: ");
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 1; j < vetor[i]; j++) {
				fat = fat + (vetor[i] * j);
			}
			System.out.print(fat + " ");
			fat = 0;
		}
	}

	public static void primoOuNao(int[] vet) {
		for (int i = 0; i < vet.length; i++) {

		}

	}

	public static void maiorEMenor(int[] vet) {
		int maior = 0;
		int menor = 99;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
			} else if (vet[i] < menor) {
				menor = vet[i];
			}
		}
	}

}
