package i.atividade.lista.ii;

import java.util.Scanner;

//t� errada �.�
public class Binario_questao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer n;

		System.out.println("Digite o n�mero a ser convertido");
		n = sc.nextInt();

		System.out.println(n + " decimal � " + decToBin(n) + " em bin�rio.");

		sc.close();
	}

	private static Integer decToBin(Integer n) {
		n /= 2;
		return decToBin(n);
	}
}
