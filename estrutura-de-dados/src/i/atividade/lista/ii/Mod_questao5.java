package i.atividade.lista.ii;

import java.util.Scanner;

public class Mod_questao5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero da divisao");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo numero da divisao");
		int num2 = sc.nextInt();

		System.out.println("O resto da divisão é: " + mod(num1, num2));

		sc.close();
	}

	private static Integer mod(int num1, int num2) {
		if (num1 > num2) {
			return mod(num1 - num2, num2);
		} else if (num1 < num2) {
			return num1;
		} else if (num1 == num2) {
			return 0;
		}
		return null;
	}

}
