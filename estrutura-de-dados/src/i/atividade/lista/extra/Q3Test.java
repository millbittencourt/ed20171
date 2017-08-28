package i.atividade.lista.extra;

public class Q3Test {
	public static void main(String[] args) {

		Q3 q3L = new Q3();
		Q3 q3M = new Q3();
		System.out.println("Teste Listas vazia:  ");
		q3L.imprime();
		q3M.imprime();

		System.out.println("Lista L:");
		q3L.insere(4);
		q3L.insere(2);
		q3L.insere(1);
		q3L.insere(9);
		q3L.insere(7);
		q3L.insere(8);
		q3L.imprime();
		System.out.println("");

		System.out.println("Lista M: ");
		q3M.insere(5);
		q3M.insere(2);
		q3M.insere(1);
		q3M.insere(7);
		q3M.imprime();

		Q3 aux = new Q3();
		System.out.println("Nova lista L: ");
		aux.dif(q3L, q3M);
		aux.imprime();
	}

}
