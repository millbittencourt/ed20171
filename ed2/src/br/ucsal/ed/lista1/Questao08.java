package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer QTD = 5;
		String[] nome = new String[QTD];
		Double[] sal = new Double[QTD];
		Double aliq = 0d;

		for (int i = 0; i < QTD; i++) {
			System.out.print("Digite o nome da " + (i + 1) + "ª pessoa. ");
			nome[i] = sc.next();
			System.out.print("Digite o salário da " + (i + 1) + "ª pessoa. ");
			sal[i] = sc.nextDouble();
		}
		
		System.out.println();
		for (int i = 0; i < sal.length; i++) {
			if (sal[i] < 600) {
				System.out.println(nome[i] + " está isento.");
			} else if (sal[i] < 1500) {
				aliq = sal[i] * 0.1;
				System.out.println(nome[i] + " paga " + aliq);
			} else {
				aliq = sal[i] * 0.15;
				System.out.println(nome[i] + " paga " + aliq);
			}
		}
	}

}
