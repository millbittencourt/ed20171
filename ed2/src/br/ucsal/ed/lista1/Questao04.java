package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao04 {

		// Escreva um programa que leia a população mundial atual e a taxa de
		// crescimento
		// demográfica anual e exiba a população esƟmada depois de um, dois, três,
		// quatro e
		// cinco anos

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			Double populacaoMundi;
			Double taxaDeCresci;
			Double crescimentoDemo;

			System.out.println("Digite o numero atual de pessoas nesse mundo de merda: ");
			populacaoMundi = sc.nextDouble();
			System.out.println("Digite a taxa de crescimento para o fim do mundo: ");
			taxaDeCresci = sc.nextDouble();

			for (int i = 1; i <= 5; i++) {
				crescimentoDemo = populacaoMundi * taxaDeCresci;
				populacaoMundi = crescimentoDemo + populacaoMundi;
				System.out.println(
						"Daqui a " + i + " ano(s), vamos ter " + populacaoMundi + " fucking pessoas nesse mundo de merda.");
			}

		}

}
