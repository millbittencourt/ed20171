package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer[][] m = new Integer[3][3];
		Integer par = 0;
		Integer impar = 0;

		System.out.println("Digite 9 números para compor a matriz.");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
				if (m[i][j] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
			System.out.println();
		}
		System.out.println("Existem " + par + " numeros pares e " + impar + " numeros impares.");

	}
}
