package i.atividade.lista.extra;

public class Q2 {

	public NoLista constroi(int[] v) {
		if (v.equals(null)) {
			System.out.println("Lista vazia. Retorno null");
			return null;
		}

		NoLista no = new NoLista();
		NoLista aux = null;
		for (int i = 0; i < v.length; i++) {
			no.setInfo(v[i]);
			System.out.print(no.getInfo() + "  ");
			aux = no;
			no.setProx(no);

		}
		return aux;
	}
}
