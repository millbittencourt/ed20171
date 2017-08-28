package i.atividade.lista.extra;

public class Q5 extends NoLista{
	private NoLista inicio;

	public void insere(int valor) {
		NoLista novo = new NoLista();
		novo.setInfo(valor);

		if (inicio == null) {
			inicio = novo;
		} else {
			novo.setProx(inicio);
			inicio = novo;
		}
	}

	public void imprime() {
		if (inicio == null)
			System.out.println("Lista vazia!");
		else {
			NoLista aux = inicio;
			while (aux != null) {
				System.out.print(aux.getInfo() + " ");
				aux = aux.getProx();
			}
		}
		System.out.println("");

	}

	public void concatena(NoLista inicio1, NoLista inicio2) {
		NoLista inicio3 = new NoLista();
		if (inicio1 == null || inicio2 == null) {
			System.out.println("Uma das listas está vazia. Insira de novo. ");
		} else {
			inicio3 = inicio1;
			while (inicio3.getProx() != null) {
				inicio3 = inicio3.getProx();
			}
			inicio3.setProx(inicio2);
		}
	}

}
