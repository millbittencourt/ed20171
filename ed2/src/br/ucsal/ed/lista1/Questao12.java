package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer[] pg = new Integer[10];
		Integer num1;
		Integer razao;

		System.out.println("Digite o numero inicial. ");
		num1 = sc.nextInt();
		System.out.println("Digite a razao. ");
		razao = sc.nextInt();

		System.out.print(num1 + " ");

		for (int i = 0; i < pg.length; i++) {
			pg[i] = num1 * razao;
			System.out.print(pg[i] + " ");
			num1 = pg[i];
		}

	}

}
