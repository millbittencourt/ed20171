package i.atividade.lista.extra;

import org.junit.Test;

public class Q5Test {
	@Test
	public static void main(String[] args) {

		Q5 l3 = new Q5();

		Q5 l1 = new Q5();
		System.out.println("Lista 1: ");
		l1.insere(5);
		l1.insere(9);
		l1.insere(15);
		l1.imprime();
		System.out.println();

		Q5 l2 = new Q5();
		System.out.println("Lista 2");
		l2.insere(8);
		l2.insere(4);
		l2.insere(2);
		l2.imprime();
		
System.out.println();
		System.out.println("Lista concatenada - Vamos rezar irmãos..");
		l3.concatena(l1, l2);
		l3.imprime();
		 System.out.println(l3.getInfo());
	}
}
