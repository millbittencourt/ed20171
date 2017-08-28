package br.ucsal.bes.ed20162.questao3;

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

	public NoLista dif(NoLista L, NoLista M) {
		NoLista auxL = L;
		NoLista auxM = M;
		NoLista ant = null;
		while (auxM != null) {
			while (auxL != null) {
				if (auxL.getInfo() == auxM.getInfo()) {
					if (ant == null) {
						inicio = auxL.getProx();
					} else if (auxL.getProx() == null) {
						ant.setProx(null);
					} else {
						ant.setProx(auxL.getProx());
					}
				}
				ant = auxL;
				auxL = auxL.getProx();
			}
			auxL = L;
			auxM = auxM.getProx();
		}
		return L;
	}
}
