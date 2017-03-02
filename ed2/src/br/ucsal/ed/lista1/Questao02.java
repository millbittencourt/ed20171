package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao02 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			String nome;
			Double peso;
			Double altura;
			Double imc;
			
			System.out.print("DIgite seu nome: ");
			nome = sc.nextLine();
			System.out.print("Digite seu peso: ");
			peso = sc.nextDouble();
			System.out.print("Digite sua altura: ");
			altura = sc.nextDouble();
			
			imc = peso/(altura*altura);

			if(imc <= 18.5){
				System.out.println("Abaixo do peso, coma bacon");
			}
			else if(imc <= 25){
				System.out.println("Peso normal, ta birl");
			}
			else if(imc <=30){
				System.out.println("Acima do peso, largue o bacon ;(");
			}
			else if(imc > 30){
				System.out.println("Vamos deixar de comer besteira seu gordo");
			}
			else{
				System.out.println("Obiviamente é um alieligena");
			}
		}
}
