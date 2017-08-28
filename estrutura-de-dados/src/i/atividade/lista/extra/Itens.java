package i.atividade.lista.extra;

public class Itens {

	private static NoItem item;

	private static void remover(int cod) {
		if (ehVazia())
			System.out.println("Lista Vazia!!");
		else {
			NoItem aux = item;
			NoItem ant = null;
			while (aux.getProx() != null && aux.getCodigo() != cod) {
				ant = aux;
				aux = aux.getProx();
			}
			if (aux.getCodigo() == cod) {
				if (ant == null) {
					item = aux.getProx();
					aux = null;
				} else if (aux.getProx() == null) {
					ant.setProx(null);
					aux = null;
				} else {
					ant.setProx(aux.getProx());
					aux = null;
				}
			}
		}
	}

	private static void inserir(String nome) {
		NoItem no = new NoItem();
		no.setNome(nome);
		if (ehVazia())
			item = no;
		else {
			if (item.getNome() != nome) {
				NoItem aux = item;
				do
					aux = aux.getProx();
				while (aux.getProx() != null);
				aux.setProx(no);
			} else
				System.out.println("Insira um novo item.");
		}
	}

	private static boolean ehVazia() {
		// TODO Auto-generated method stub
		return item == null;
	}

	private static void consultar() {

	}
}
