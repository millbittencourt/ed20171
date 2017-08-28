package i.atividade.lista.ii;

import java.util.Scanner;

//tá errada ç.ç
public class Binario_questao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer n;

		System.out.println("Digite o número a ser convertido");
		n = sc.nextInt();

		System.out.println(n + " decimal é " + decToBin(n) + " em binário.");

		sc.close();
	}

	private static Integer decToBin(Integer n) {
		n /= 2;
		return decToBin(n);
	}
}
