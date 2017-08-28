package i.atividade.lista.iii;

public class ListaOrdenada {

	private NoLista inicio;

	public void imprimir() {
		if (ehVazia()) {
			System.out.println("Lista vazia!");
		} else {
			NoLista aux = inicio;
			while (aux != null) {
				System.out.print(aux.getValor() + " ");
				aux = aux.getProx();
			}
		}
		System.out.println(" ");
	}

	public boolean contem(Integer valor) {
		boolean achou = false;

		if (ehVazia()) {
			System.out.println("Lista Vaza!");
		} else {
			NoLista aux = inicio;
			while (aux.getProx() != null && aux.getValor() != valor) {
				aux = aux.getProx();
				if (valor == aux.getValor()) {
					achou = true;
				} else {
					System.out.println("Valor nao encontrado.");
				}
			}
		}

		return achou;
	}

	public void remover(Integer valor) {
		if (ehVazia()) {
			System.out.println("Lista vazia.");
		} else {
			NoLista ant = null;
			NoLista aux = inicio;

			while (aux.getProx() != null && aux.getValor() != valor) {
				ant = aux;
				aux = aux.getProx();
			}
			if (ant == null) {
				inicio = aux.getProx();
				aux = null;
			} else if (aux.getProx() == null && aux.getValor() == valor) {
				ant.setProx(null);
				aux = null;
			} else if (aux.getProx() == null && aux.getValor() != valor) {
				System.out.println("Valor pra remover não encontrado.");
			} else {
				ant.setProx(aux.getProx());
				aux = null;
			}

		}
	}

	public void inserir(Integer valor) {

		NoLista novo = new NoLista();
		novo.setValor(valor);

		if (ehVazia()) {
			inicio = novo;
		} else {
			NoLista ant = null;
			NoLista aux = inicio;

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
		if (inicio == null) {
			return true;
		}
		return false;
	}

}