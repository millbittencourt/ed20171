package i.atividade.lista.iii;

public class UltimaListaSimplesNaoOrdenada {

	private NoLista inicio;

	public boolean ehVazia() {
		if (inicio == null) {
			return true;
		}
		return false;
	}

	public void inserirNoInicio(Integer valor) {
		NoLista novo = new NoLista();
		novo.setValor(valor);
		if (ehVazia()) {
			inicio = novo;
		} else {
			novo.setProx(inicio);
			inicio = novo;
		}
	}

	public void inserirNoFim(Integer valor) {
		NoLista novo = new NoLista();
		novo.setValor(valor);

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

	public void remover(Integer valor) {
		if (ehVazia()) {
			System.out.println("Lista vazia. Não há o que remover.");
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
				System.out.println("Valor não encontrado para remover.");
			} else {
				ant.setProx(aux.getProx());
				aux = null;
			}
		}
	}

	public boolean contem(Integer valor) {
		boolean achou = false;

		if (ehVazia()) {
			System.out.println("Não contem nada. Lista vazia. ");
		} else {
			NoLista aux = inicio;
			while (aux.getProx() != null && aux.getValor() != valor) {
				aux = aux.getProx();
			}
			if (aux.getValor() == valor) {
				achou = true;
			} else {
				System.out.println("Valor não encontrado.");
			}
		}

		return achou;
	}

	public void imprimir() {
		if (ehVazia()) {
			System.out.println("Error 404 not found. Lista Vazia.");
		} else {
			NoLista aux = inicio;
			while (aux != null) {
				System.out.print(aux.getValor() + " ");
				aux = aux.getProx();
			}
		}
		System.out.println(" ");
	}
}
