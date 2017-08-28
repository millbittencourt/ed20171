package i.atividade.lista.iii;

public class Questao2 {

	public static void main(String[] args) {

		ListaOrdenada lista = new ListaOrdenada();

		lista.inserir(3);
		lista.inserir(17);
		lista.inserir(5);
		lista.inserir(12);
		lista.inserir(1);

		lista.imprimir();
		System.out.println("Esperado: 1 3 5 12 17");

	}
}
