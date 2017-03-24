package br.ucsal.ed.quest01;

import java.util.Scanner;

public class Cadastro {

	private static int QTD = 15;
	public static Scanner sc = new Scanner(System.in);
	public static Registro registro[] = new Registro[QTD];

	public static void main(String[] args) {
		cadastroCursos();
		mediaAritmeticaTodosAlunos();
		cursoMaiorReceita();
	}

	private static void cursoMaiorReceita() {
		Double receita;
		Double maior = 0d;
		Integer curso = 10;
		//  A descrição do curso que gera a maior receita (receita = quantidade
		// de
		// alunos * valor da mensalidade).
		for (int i = 0; i < registro.length; i++) {
			receita = (registro[i].getQtdAlunos() * registro[i].getValorMensalidade());
			if (receita > maior) {
				maior = receita;
				curso = i;
			}
		}
		System.out.println("O curso com a maior receita é: "+registro[curso].getDescrição());

	}

	private static void cadastroCursos() {
		String descricao;
		Integer qtdA;
		Double valorM;

		System.out.println("------- CADASTRO DE CURSOS -------");
		for (int i = 0; i < QTD; i++) {
			System.out.println("Digite o nome do curso. ");
			descricao = sc.next();
			System.out.println("Digite a quantidade de alunos do curso. ");
			qtdA = sc.nextInt();
			System.out.println("Digite o valor da mensalidade do curso. ");
			valorM = sc.nextDouble();

			Registro reg = new Registro(descricao, qtdA, valorM);
			reg.setDescrição(descricao);
			reg.setQtdAlunos(qtdA);
			reg.setValorMensalidade(valorM);

			registro[i] = reg;

		}

	}

	private static void mediaAritmeticaTodosAlunos() {
		Integer mediaA;
		Integer soma = 0;
		// pega qtd de alunos total
		System.out.println("------- MÉDIA DOS ALUNOS -------");
		for (int i = 0; i < registro.length; i++) {
			soma += registro[i].getQtdAlunos();
		}
		// por quantidade de cursos total
		mediaA = (soma / registro.length);
		System.out.println("A média de alunos matriculados é: " + mediaA);
	}
}
