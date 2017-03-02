package br.ucsal.ed.lista1;

import java.util.Random;

public class Questao07 {

		public static void main(String[] args) {

			int[] vetA = new int[10];
			int[] vetB = new int[10];
			int[] vetC = new int[10];

			Random rd = new Random();

			for (int i = 0; i < vetA.length; i++) {
				vetA[i] = rd.nextInt(10);
				System.out.print(vetA[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < vetB.length; i++) {
				vetB[i] = rd.nextInt(10);
				System.out.print(vetB[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < vetC.length; i++) {
				vetC[i] = vetA[i] * vetB[i];
				System.out.print(vetC[i] + " ");
			}
		}

}
