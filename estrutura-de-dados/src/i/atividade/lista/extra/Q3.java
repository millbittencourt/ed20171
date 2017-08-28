package i.atividade.lista.extra;

public class Q3 extends NoLista {

	private NoLista inicio;

	public NoLista dif(NoLista L, NoLista M) {

		NoLista l = L;
		NoLista m = M;

		while (m != null) {
			while (l != null) {
				NoLista ant = null;
				if (l.getInfo() == m.getInfo()) {
					if (ant == null){
						inicio = l.getProx();
					}						
				}
				ant = l;
				l = l.getProx();
			}
			l = L;
			m = m.getProx();
		}
		return L;
	}

	public void insere(int valor) {

		NoLista novo = new NoLista();
		novo.setInfo(valor);

		if (ehVazia()) {
			inicio = novo;
		} else {
			novo.setProx(inicio);
			inicio = novo;
		}
	}

	public void imprime() {
		if (ehVazia())
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

	private boolean ehVazia() {
		// TODO Auto-generated method stub
		return inicio == null;
	}

}
