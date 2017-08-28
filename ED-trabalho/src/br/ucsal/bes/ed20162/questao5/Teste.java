package br.ucsal.bes.ed20162.questao5;

public class Teste {

	public static void main(String[] args) {
		
		Lista l1 = new Lista();
		Lista l2 = new Lista();
		
		System.out.print("Lista1: ");
		l1.inserir(40);
		l1.inserir(30);
		l1.inserir(5);
		l1.inserir(0);
		l1.imprimir();
						
		System.out.print("\n\nLista2: ");
		l2.inserir(6);
		l2.inserir(81);
		l2.inserir(2);
		l2.inserir(40);
		l2.imprimir();
		
		System.out.print("\n\nLista concatenadas: ");
		Concatenar lconc = new Concatenar();
		lconc.concatena(l1, l2);
		lconc.imprimir();
		
	}

}
