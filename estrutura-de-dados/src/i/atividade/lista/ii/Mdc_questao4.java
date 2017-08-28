package i.atividade.lista.ii;

import java.util.Scanner;

public class Mdc_questao4 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Integer num1;
		Integer num2;

		System.out.println("Digite o primeiro numero");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número");
		num2 = sc.nextInt();

		System.out.println("O Maior Divisor Comum entre " + num1 + " e " + num2 + " é: " + mdc(num1, num2));
	}

	private static Integer mdc(Integer num1, Integer num2) {

		if (num1 > num2) {
			return mdc(num1 - num2, num2);
		} else if (num1 == num2)
			return num1;

		return mdc(num2, num1);

	}

}
