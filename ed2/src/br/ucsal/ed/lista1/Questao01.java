package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao01 {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double tempC;
			double tempF;
			System.out.println("Digite uma temperatura em Celsius.");
			tempC = sc.nextDouble();
			tempF = tempC * 1.8 + 32;

			System.out.println(tempC+"ºC são "+tempF+"F");
	 
		}

	}

