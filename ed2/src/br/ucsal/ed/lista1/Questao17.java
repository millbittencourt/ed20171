package br.ucsal.ed.lista1;

import java.util.Random;

public class Questao17 {

	public static void main(String[] args) {
		Random rd = new Random();

		Integer[][] matrizA = new Integer[5][5];
		Integer[][] matrizB = new Integer[5][5];
		Integer[][] matrizC = new Integer[5][5];

		System.out.println("Matriz A:");
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC.length; j++) {
				matrizA[i][j] = rd.nextInt(5);
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Matriz B: ");
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC.length; j++) {
				matrizB[i][j] = rd.nextInt(5);
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Matriz C:");
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC.length; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}
	}

}
