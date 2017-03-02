package br.ucsal.ed.lista1;

import java.util.Random;

public class Questao18 {

	public static void main(String[] args) {
		Random rd = new Random();

		Integer[] arrayA = new Integer[5];
		Integer[] arrayB = new Integer[8];
		Integer[] arrayC = new Integer[arrayA.length + arrayB.length];
		

		System.out.println("Array A ");
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = rd.nextInt(10);
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();
		System.out.println("Array B ");
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = rd.nextInt(10);
			System.out.print(arrayB[i] + " ");
		}
		System.out.println();
		System.out.println("Array C ");

		for (int i = 0; i < arrayA.length; i++) {
			arrayC[i] = arrayA[i];
			arrayC[i + 5] = arrayB[i];

		}
		// Lendo os valores de C
		for (int i = 0; i < arrayC.length; i++)
			System.out.print(arrayC[i] + " ");

	
	}

}