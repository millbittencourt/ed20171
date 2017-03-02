package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao11 {

	/*
	 * Crie um app q peça ao usuario um valor inicial, umarazãoe calcule os 10
	 * primeiros termos de uma P.A., armazenando num array
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer[] pa = new Integer[10];
		Integer num1;
		Integer razao;

		System.out.println("Digite o numero inicial.");
		num1 = sc.nextInt();
		System.out.println("Digite a razão.");
		razao = sc.nextInt();

		System.out.print(num1 + " ");

		for (int i = 0; i < pa.length; i++) {
			pa[i] = num1 + razao;
			System.out.print(pa[i] + " ");
			num1 = pa[i];
		}
	}

}
