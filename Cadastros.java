package br.ucsal.ed.avaliacao1.questao2;

import java.util.Scanner;

public class Cadastros {

	private static Double[] vetorSalario = new Double[5];
	private static Registros[] registro = new Registros[15];
	private static Scanner sc = new Scanner(System.in);

	private static void menuDoUsuario() {

		Integer opc;
		Integer codCargo;

		System.out.println("---------- MENU ----------");
		System.out.println("Digite a op��o que deseja." + " \nOp��o 1: Cadastrar os cargos da empresa. "
				+ " \nOp��o 2: Cadastrar os funcion�rios da empresa." + " \nOp��o 3: Mostrar o relat�rio"
				+ "\nOp��o 4: Mostrar valor pago aos pertencentes a um determinado cargo." + "\nOp��o 5: Finalizar.\n");
		opc = sc.nextInt();

		switch (opc) {
		case 1:
			// Op��o 1: Cada vez que essa op��o for selecionada dever� ser
			// chamada uma subrotina,
			// na qual o usu�rio poder� cadastrar todos os cargos. N�o esque�a,
			// nessa
			// empresa existem apenas cinco cargos. Se o usu�rio mandar executar
			// esta op��o mais
			// de uma vez, mostre a mensagem de erro �Sal�rio dos cargos j�
			// cadastrados� e retorne
			// ao menu.
			System.out.println("Digite o c�digo do cargo que deseja cadastrar o sal�rio.");
			codCargo = sc.nextInt();

			cadastrarTodosOsCargos(codCargo, registro);
			break;
		case 2:
			// Op��o 2: Cada vez que essa op��o for selecionada dever� ser
			// chamada uma subrotina,
			// na qual o usu�rio poder� cadastrar um novo funcion�rio, ou seja,
			// informar� o
			// n�mero do funcion�rio (este n�mero deve ser �nico, voc� dever�
			// implementar essa
			// valida��o), nome e c�digo do cargo (lembre-se de que o c�digo
			// informado dever� existir
			// no vetor de cargos). N�o se esque�a, nessa empresa existem apenas
			// 15 funcion�rios.
			// Se o usu�rio selecionar essa op��o e o vetor de funcion�rios
			// estiver completamente
			// preenchido, mostrar uma mensagem de erro e retornar ao menu.
			// Crie uma sub-rotina para fazer a valida��o do n�mero do
			// funcion�rio � ela n�o poder�
			// aceitar n�mero repetido.
			// Crie uma sub-rotina para validar o nome do funcion�rio,
			// obrigando-o a ser composto por
			// pelo menos duas palavras ( nome e sobrenome ).
			// Crie uma sub-rotina para fazer a valida��o do c�digo do cargo
			// ocupado pelo funcion�rio
			// � ela s� poder� aceitar c�digos entre 1 e 5 cujos sal�rios j�
			// tenham sido cadastrados no
			// vetor de cargos.
			cadastrarNovoFuncionario(registro);
			;
			break;
		case 3:
			// Op��o 3: Cada vez que essa op��o for selecionada dever� ser
			// chamada uma subrotina,
			// na qual ser�o mostrados c�digo, nome e valor do sal�rio de todos
			// os funcion�rios
			// cadastrados ( sal�rios podem ser obtidos no vetor de cargos).
			;
			break;
		case 4:
			// Op��o 4: Cada vez que essa op��o for selecionada dever� ser
			// chamada uma subrotina,
			// na qual ser� feito o somat�rio do sal�rio de todos os
			// funcion�rios que
			// pertencerem a determinado cargo. Essa cargo � informado pelo
			// usu�rio (entre 1 e 5) no
			// m�dulo principal do seu programa e o somat�rio calculado dever�
			// ser mostrado,
			// tamb�m, no m�dulo principal. Fonte 1
			// (7,0 pontos)
			;
			break;
		case 5:
			;
			break;
		default:
			System.out.println("Digite uma op��o de 1 - 5, por favor!");
			break;
		}

	}

	private static void cadastrarNovoFuncionario(Registros[] registro2) {
		// TODO Auto-generated method stub
		
	}

	private static void cadastrarTodosOsCargos(Integer codCargo, Registros[] registro) {
		Registros reg = new Registros();
		//percorre o vetor de salarios
		for (int i = 0; i < vetorSalario.length; i++) {
			//se j� houver c�digo do cargo cadastrado, volta p menu
			if (codCargo.equals(reg.getCodigoCargo()) {
				System.err.println("Sal�rio dos cargos j� cadastrados. Estaremos te redirecionando ao menu.");
				menuDoUsuario();
			}//se nao, cadastra ele no vetor de salario
			else if (codCargo > 0 && codCargo <= 5) {
				System.out.println("Digite o sal�rio do cargo n� "+codCargo);
				vetorSalario[i] = sc.nextDouble();
			}
		}
	}

	public static void main(String[] args) {

	}

}
