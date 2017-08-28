package i.prova1.helpmegod;

public class Provacao1 {

	private NoLista inicio;

	public void imprimir() {

		if (ehVazia())
			System.out.println("Lista Vazia. :[");
		else {
			NoLista aux = inicio;
			while (aux != null) {
				System.out.println(aux.getValor() + " ");
				aux = aux.getProx();
			}
		}

	}

	public NoLista remover() {
		NoLista aux = inicio;
		NoLista ant = null;

		while (aux.getProx() != null) {
			ant = aux;
			aux = aux.getProx();
		}
		if (aux.getProx() == null) {
			ant.setProx(null);
			aux = inicio;
		}
		return aux;
	}

	public boolean contem(Integer valor) {
		boolean achou = false;
		if (ehVazia()) {
			System.out.println("Lista vazia.");
			achou = false;
		} else {
			NoLista aux = inicio;
			while (aux.getProx() != null && aux.getValor() != valor) {
				aux = aux.getProx();
			}
			if (aux.getValor() == valor)
				achou = true;
			else
				System.out.println("Valor nao encontrado");
		}

		return achou;
	}

	public void inserir(Integer valor) {
		NoLista novo = new NoLista();
		novo.setValor(valor);

		if (ehVazia()) {
			inicio = novo;
		} else {
			NoLista aux = inicio;
			NoLista ant = null;
			while (aux.getProx() != null && aux.getValor() < valor) {
				ant = aux;
				aux = aux.getProx();
			}
			if (ant == null) {
				novo.setProx(inicio);
				inicio = novo;
			} else if (aux.getProx() == null) {
				aux.setProx(novo);
			} else {
				ant.setProx(novo);
				novo.setProx(aux);
			}

		}

	}

	public boolean ehVazia() {
		if (inicio == null)
			return true;
		return false;
	}

}
