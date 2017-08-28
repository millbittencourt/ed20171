package br.ucsal.bes.ed20162.questao2;

public class Lista {

	private NoLista inicio;

	public NoLista constroi(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			NoLista novo = new NoLista();
			novo.setInfo(vetor[i]);
			if (ehVazia()) {
				inicio = novo;
			} else {
				NoLista aux = inicio;
				while(aux.getProx() != null){
					aux=aux.getProx();
				}
				aux.setProx(novo);
			}
		}
		return inicio;
	}

	public void imprime() {
		if (ehVazia()) {
			System.out.println("Lista Vazia!");
		} else {
			NoLista aux = inicio;
			while (aux != null) {
				System.out.print(aux.getInfo() + " ");
				aux = aux.getProx();
			}
		}
		System.out.println("");
	}

	public boolean ehVazia() {
		if (inicio == null) {
			return true;
		}
		return false;
	}

}