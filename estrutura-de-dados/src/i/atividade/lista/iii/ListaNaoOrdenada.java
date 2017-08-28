package i.atividade.lista.iii;

public class ListaNaoOrdenada {

	private NoLista inicio;

	public NoLista getInicio() {
		return inicio;
	}

	public NoLista concatena(NoLista l1, NoLista l2) {
		if (l1 == null)
			return l2;
		else {
			NoLista aux = l1;
			while (aux.getProx() != null) {
				aux = aux.getProx();
			}
			aux.setProx(l2);
		}
		return l1;

	}

	public NoLista separa(ListaNaoOrdenada lista1, Integer valor) {
		NoLista nova_lista = null;
		NoLista aux = lista1.getInicio();

		while (aux.getValor() != valor && aux.getProx() != null) {
			aux = aux.getProx();
		}
		if (aux.getValor() == valor) {
			nova_lista = aux.getProx();
			aux.setProx(null);
		}
		return nova_lista;
	}

	public void imprimir() {
		if (ehVazia()) {
			System.out.println("Lista vazia. Sorry babes.");
		} else {
			NoLista aux = inicio;
			while (aux != null) {
				System.out.print(aux.getValor() + " ");
				aux = aux.getProx();
			}
		}
		System.out.println(" ");
	}

	public void remover(Integer valor) {
		if (ehVazia()) {
			System.out.println("Lista vazia, não tem o que remover ô cabeça");
		} else {
			NoLista aux = inicio;
			NoLista ant = null;

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
				System.out.println("Valor não encontrado. Como remover?");
			} else {
				ant.setProx(aux.getProx());
				aux = null;
			}
		}
	}

	public Boolean contem(Integer valor) {
		boolean achou = false;
		if (ehVazia()) {
			System.out.println("Lista Vazia!!");
		} else {
			NoLista aux = inicio;
			while (aux.getValor() != valor && aux.getProx() != null) {
				aux = aux.getProx();
			}
			if (valor == aux.getValor()) {
				achou = true;
			} else {
				System.out.println("Valor não encontrado!");
			}
		}
		return achou;
	}

	public void inserir(Integer valor) {

		NoLista novo = new NoLista();
		novo.setValor(valor);

		if (ehVazia()) {
			inicio = novo;
		} else {
			novo.setProx(inicio);
			inicio = novo;
		}
	}

	public Boolean ehVazia() {

		if (inicio == null) {
			return true;
		}
		return false;
	}

}
