package i.atividade.lista.iii;

public class UltimoTesteListaSimplesNaoOrdenada {
	public static void main(String[] args) {

		UltimaListaSimplesNaoOrdenada lista = new UltimaListaSimplesNaoOrdenada();

		System.out.println("Esperado: lista vazia. \n");
		lista.imprimir();

		lista.inserirNoFim(5);
		lista.inserirNoFim(8);
		lista.inserirNoFim(4);
		lista.inserirNoInicio(2);
		lista.inserirNoInicio(9);
		lista.inserirNoInicio(7);
		System.out.println("Esperado: 7 9 2 5 8 4");
		lista.imprimir();

		lista.remover(8);
		lista.remover(5);
		lista.remover(4);
		lista.remover(7);
		System.out.println("Esperado: 9 2");
		lista.imprimir();

		lista.inserirNoFim(8);
		lista.inserirNoInicio(1);
		System.out.println("Esperado: 1 9 2 8");
		lista.imprimir();

		System.out.println("Expected: false");
		System.out.println(lista.contem(4));
		System.out.println("Esperado: true");
		System.out.println(lista.contem(9));

	}
}
