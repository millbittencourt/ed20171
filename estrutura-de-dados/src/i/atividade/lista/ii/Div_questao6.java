package i.atividade.lista.ii;

import java.util.Scanner;

public class Div_questao6 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int x;
		int y;

		System.out.println("Digite o primeiro numero inteiro");
		x = sc.nextInt();
		System.out.println("Digite o segundo  numero inteiro");
		y = sc.nextInt();

		System.out.println("O quociente da divisão entre " + x + " e " + y + " é: " + div(x, y));

	}

	private static Integer div(int x, int y) {
		if (modulo(x) > modulo(y)) {
			return 1 + div(modulo(x) - modulo(y), modulo(y));
		} else if (x < y) {
			return 0;
		} else {
			return 1;
		}

	}

	private static int modulo(int x) {
		if (x < 0) {
			return x * -1;
		}
		return x;
	}
}
