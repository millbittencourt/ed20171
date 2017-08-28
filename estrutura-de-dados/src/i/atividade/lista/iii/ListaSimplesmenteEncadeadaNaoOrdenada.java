package i.atividade.lista.iii;

public class ListaSimplesmenteEncadeadaNaoOrdenada {

	private NoLista inicio;

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

	public void inserirNoFinal(Integer valor) {
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
			System.out.println("Liista Vazia. ");
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
			} else if (aux.getProx() == null && aux.getValor() != null) {
				System.out.println("Valor nao encontrado.!");
			} else {
				ant.setProx(aux.getProx());
				aux = null;
			}
		}
	}

	public boolean contem(Integer valor) {
		boolean achou = false;

		if (ehVazia()) {
			System.out.println("Lista vazia, hein.");
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
			System.out.println("Lista vazia. Imprimo nada.");
		} else {
			NoLista aux = inicio;
			//não imprime o último valor
			while (aux.getProx() != null) {
				System.out.print(aux.getValor() + " ");
				aux = aux.getProx();
			}
			//agora imprime
			System.out.println(aux.getValor());
		}
		System.out.println(" ");
	}

	public boolean ehVazia() {
		if (inicio == null) {
			return true;
		}
		return false;
	}
}
