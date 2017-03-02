package br.ucsal.ed.lista1;

import java.util.Random;

public class Questao05 {
		public static void main(String[] args) {
			Random rd = new Random();

			int[] vetor = new int[10];
			int check = 0;
			Boolean tem = false;
			System.out.println("O vetor é: ");

			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = rd.nextInt(10);
				System.out.print(vetor[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < vetor.length; i++) {
				for (int j = 1; j < vetor.length; j++) {
					check = vetor[i] * vetor[j];
					if (check % 2 == 0) {
						tem = true;
					}
				}
			}
		System.out.println("A soma de algum par desse vetorzinho é par? \n"  + tem);
		
		}
	
}
