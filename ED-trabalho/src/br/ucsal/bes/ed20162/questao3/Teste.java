package br.ucsal.bes.ed20162.questao3;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Listas não modificadas: ");
		Lista lM = new Lista();
		System.out.print("Lista M: ");
		lM.inserir(10);
		lM.inserir(5);
		lM.inserir(80);
		lM.inserir(1);
		lM.inserir(3);
		lM.imprime();

		System.out.println();
		
		Lista lL = new Lista();
		System.out.print("Lista L: ");
		lL.inserir(20);
		lL.inserir(55);
		lL.inserir(3);
		lL.inserir(5);
		lL.inserir(80);
		lL.imprime();
		
		NoLista L = lL.getInicio();
		NoLista M = lM.getInicio();
		System.out.println("\nLista L Modificada: ");
		Lista lm = new Lista();
		lm.setInicio(lm.dif(L,M));
		lm.imprime();
		
	}

}
