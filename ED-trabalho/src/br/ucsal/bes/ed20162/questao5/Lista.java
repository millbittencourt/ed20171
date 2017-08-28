package br.ucsal.bes.ed20162.questao5;

public class Lista {

	private NoLista inicio;

	public NoLista getInicio() {
		return inicio;
	}
	
	public void setInicio(NoLista inicio) {
		this.inicio = inicio;
	}
	
	public void inserir(int valor) {
		NoLista novo = new NoLista();
		novo.setInfo(valor);
		if (ehVazia()) {
			inicio = novo;
		} else {
			NoLista aux = inicio;
			while (aux.getProx() != null) {
				aux = aux.getProx();
			}
			aux.setProx(novo);
		}
	}

	public void imprimir() {
		if (ehVazia()) {
			System.out.println("Lista vazia!");
		} else {
			NoLista aux = inicio;
			while (aux != null) {
				System.out.print(aux.getInfo() + " ");
				aux = aux.getProx();
			}
		}
	}

	public boolean ehVazia() {
		if (inicio == null) {
			return true;
		}
		return false;
	}
	
}
