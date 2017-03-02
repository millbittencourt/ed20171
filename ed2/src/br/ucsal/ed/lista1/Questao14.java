package br.ucsal.ed.lista1;

import java.util.Random;

public class Questao14 {
	// matriz aleatoria, entre 0 e 9; maior numero da mari e posião LxC.

	public static void main(String[] args) {
		Random rd = new Random();

		Integer[][] matriz = new Integer[4][4];
		Integer maior = 0;
		Integer linha = 0;
		Integer coluna = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = rd.nextInt(10);
				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
			System.out.println();
		}

		System.out.println("O maior numero da matriz é o " + maior + " que fica na " + (linha + 1) + "ª linha e na "
				+ (coluna + 1) + "ª coluna.");

	}

}
