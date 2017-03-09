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
		System.out.println("Digite a opção que deseja." + " \nOpção 1: Cadastrar os cargos da empresa. "
				+ " \nOpção 2: Cadastrar os funcionários da empresa." + " \nOpção 3: Mostrar o relatório"
				+ "\nOpção 4: Mostrar valor pago aos pertencentes a um determinado cargo." + "\nOpção 5: Finalizar.\n");
		opc = sc.nextInt();

		switch (opc) {
		case 1:
			// Opção 1: Cada vez que essa opção for selecionada deverá ser
			// chamada uma subrotina,
			// na qual o usuário poderá cadastrar todos os cargos. Não esqueça,
			// nessa
			// empresa existem apenas cinco cargos. Se o usuário mandar executar
			// esta opção mais
			// de uma vez, mostre a mensagem de erro “Salário dos cargos já
			// cadastrados” e retorne
			// ao menu.
			System.out.println("Digite o código do cargo que deseja cadastrar o salário.");
			codCargo = sc.nextInt();

			cadastrarTodosOsCargos(codCargo, registro);
			break;
		case 2:
			// Opção 2: Cada vez que essa opção for selecionada deverá ser
			// chamada uma subrotina,
			// na qual o usuário poderá cadastrar um novo funcionário, ou seja,
			// informará o
			// número do funcionário (este número deve ser único, você deverá
			// implementar essa
			// validação), nome e código do cargo (lembre-se de que o código
			// informado deverá existir
			// no vetor de cargos). Não se esqueça, nessa empresa existem apenas
			// 15 funcionários.
			// Se o usuário selecionar essa opção e o vetor de funcionários
			// estiver completamente
			// preenchido, mostrar uma mensagem de erro e retornar ao menu.
			// Crie uma sub-rotina para fazer a validação do número do
			// funcionário – ela não poderá
			// aceitar número repetido.
			// Crie uma sub-rotina para validar o nome do funcionário,
			// obrigando-o a ser composto por
			// pelo menos duas palavras ( nome e sobrenome ).
			// Crie uma sub-rotina para fazer a validação do código do cargo
			// ocupado pelo funcionário
			// – ela só poderá aceitar códigos entre 1 e 5 cujos salários já
			// tenham sido cadastrados no
			// vetor de cargos.
			cadastrarNovoFuncionario(registro);
			;
			break;
		case 3:
			// Opção 3: Cada vez que essa opção for selecionada deverá ser
			// chamada uma subrotina,
			// na qual serão mostrados código, nome e valor do salário de todos
			// os funcionários
			// cadastrados ( salários podem ser obtidos no vetor de cargos).
			;
			break;
		case 4:
			// Opção 4: Cada vez que essa opção for selecionada deverá ser
			// chamada uma subrotina,
			// na qual será feito o somatório do salário de todos os
			// funcionários que
			// pertencerem a determinado cargo. Essa cargo é informado pelo
			// usuário (entre 1 e 5) no
			// módulo principal do seu programa e o somatório calculado deverá
			// ser mostrado,
			// também, no módulo principal. Fonte 1
			// (7,0 pontos)
			;
			break;
		case 5:
			;
			break;
		default:
			System.out.println("Digite uma opção de 1 - 5, por favor!");
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
			//se já houver código do cargo cadastrado, volta p menu
			if (codCargo.equals(reg.getCodigoCargo()) {
				System.err.println("Salário dos cargos já cadastrados. Estaremos te redirecionando ao menu.");
				menuDoUsuario();
			}//se nao, cadastra ele no vetor de salario
			else if (codCargo > 0 && codCargo <= 5) {
				System.out.println("Digite o salário do cargo nº "+codCargo);
				vetorSalario[i] = sc.nextDouble();
			}
		}
	}

	public static void main(String[] args) {

	}

}
