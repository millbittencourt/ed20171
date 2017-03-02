package br.ucsal.ed.lista1;

import java.util.Scanner;

public class Questao03 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			Double num1;
			Double num2;
			String op;
			Double resul = 0d;

			System.out.println("------------------- CALCULADORA ----------------------");
			System.out.print("Digite o primeiro número: ");
			num1 = sc.nextDouble();
			System.out.print("Digite a oepração (+, -, / ou *) ");
			op = sc.next();
			System.out.print("Digite o segundo número: ");
			num2 = sc.nextDouble();

			switch (op) {
			case "+":
				resul = num1 + num2;
				break;
			case "-":
				resul = num1 - num2;
				break;
			case "*":
				resul = num1 * num2;
				break;
			case "/":
				resul = num1 / num2;
				break;
			}

			System.out.println(num1 + " " + op + " " + num2 + " = " + resul);
		}

}
