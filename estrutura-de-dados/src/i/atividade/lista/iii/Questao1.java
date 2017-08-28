package i.atividade.lista.iii;

public class Questao1 {

	public static void main(String[] args) {
		ListaNaoOrdenada lista = new ListaNaoOrdenada();
		ListaNaoOrdenada lista2 = new ListaNaoOrdenada();

		lista.inserir(3);
		lista.inserir(17);
		lista.inserir(5);
		lista.inserir(12);
		lista.inserir(1);

		lista.imprimir();

		System.out.println("Esperado: 1 12 5 17 3");

		lista2.separa(lista, 5);
		lista.imprimir();
		System.out.println("Esperado: 1 12 5");
		
	}
}
