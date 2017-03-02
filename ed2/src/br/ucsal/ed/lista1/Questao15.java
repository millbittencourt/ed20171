package br.ucsal.ed.lista1;

import java.util.Random;

public class Questao15 {

	// matriz 10x10 aleatoria valores entre 0 e 9; maior e menor valor da linha
	// 5 e maior e menor coluna 7

	public static void main(String[] args) {
		Random rd = new Random();
		Integer[][] matriz = new Integer[10][10];
		Integer maiorL = 0;
		Integer menorL = 99;
		Integer maiorC = 0;
		Integer menorC = 99;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = rd.nextInt(10);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][7] > maiorC) {
					maiorC = matriz[i][7];
				}
				if (matriz[i][7] < menorC) {
					menorC = matriz[i][7];
				}

				if (matriz[5][j] > maiorL) {
					maiorL = matriz[5][j];
				}
				if (matriz[5][j] < menorL) {
					menorL = matriz[5][j];
				}
			}
		}
		System.out.println("\nO maior valor da linha 5 é: " + maiorL + ", e o menor é: " + menorL);
		System.out.println("O maior valor da coluna 7 é: " + maiorC + ", e o menor é: " + menorC);

	}

}
