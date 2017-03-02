package br.ucsal.ed.lista1;

import java.util.Random;

public class Questao09 {
	public static void main(String[] args) {

		Random rd = new Random();
		Integer num = rd.nextInt(10);
		Integer raiz = 0;

		System.out.println("O numero é " + num);

		for (int i = 1; num >= 0; i = i + 2) {
			num = num - i;
			System.out.print(num + " ");
			if (num >= 0)
				raiz++;
		}
		System.out.println();
		System.out.println("A raiz é aproximadamente: " + raiz);

	}
}
