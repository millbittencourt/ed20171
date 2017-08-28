package i.atividade.lista.iii;

public class ListaSimplesmenteEncadeadaNaoOrdenadaTest {
	public static void main(String[] args) {
		ListaSimplesmenteEncadeadaNaoOrdenada lista = new ListaSimplesmenteEncadeadaNaoOrdenada();

		lista.imprimir();
		System.out.println("Esperado - lista vazia");
		lista.contem(7);
		System.out.println("Esperado - lista vazia");

		lista.inserirNoFinal(7);
		lista.inserirNoInicio(4);
		lista.inserirNoFinal(10);
		lista.inserirNoInicio(8);
		lista.inserirNoFinal(1);
		lista.imprimir();
		System.out.println("Esperado - 8 4 7 10 1");

		lista.contem(4);
		lista.remover(10);
		lista.remover(4);
		lista.remover(5);
		lista.imprimir();

		System.out.print("Esperado - 8 7 1");
	}
}
