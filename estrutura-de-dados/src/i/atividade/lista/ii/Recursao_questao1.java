package i.atividade.lista.ii;

import java.util.Scanner;

public class Recursao_questao1 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Integer x;
		Integer n;

		System.out.println("========== x elevado a n ==========");

		System.out.println("Digite x: ");
		x = sc.nextInt();
		System.out.println("Digite n: ");
		n = sc.nextInt();

		Integer resultado = recursao(x, n);

		System.out.println(x + " elevado a " + n + " é igual a: " + resultado);
	}

	private static Integer recursao(Integer x, Integer n) {
		if (n == 0) {
			return 1;
		}
		return x * recursao(x, n - 1);
	}
}
