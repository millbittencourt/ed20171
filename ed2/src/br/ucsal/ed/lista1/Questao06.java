package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao06 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String word;
			
			System.out.println("Digite uma palavra qualquer. ");
			word = sc.next();
			
			for(int i = word.length()-1; i >= 0; i--)  {
				System.out.print(word.charAt(i));
				
			}
			
			
		}

}
