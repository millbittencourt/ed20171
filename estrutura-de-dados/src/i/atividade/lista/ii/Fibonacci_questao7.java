package i.atividade.lista.ii;

import java.util.Scanner;

public class Fibonacci_questao7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("=====  Fibonacci  =====\n");

		System.out.println("Digite a ordem do termo");
		n = sc.nextInt();

		System.out.println("O termo de ordem " + n + " é o " + fib(n));

		for (int i = 0; i < n; i++) {
			System.out.print(fib(i) + " ");
		}

sc.close();
}

	private static Integer fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

}
