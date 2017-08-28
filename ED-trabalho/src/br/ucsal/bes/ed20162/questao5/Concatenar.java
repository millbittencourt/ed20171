package br.ucsal.bes.ed20162.questao5;

public class Concatenar {
	private NoLista inicio;
	
	public void concatena(Lista l1, Lista l2){
		if(!l1.ehVazia() && !l2.ehVazia()){
			NoLista aux = l1.getInicio();
			while(aux.getProx() != null){
				aux = aux.getProx();
			}
			aux.setProx(l2.getInicio());
			l2.setInicio(null);
		}
	}
	
	public void imprimir() {
		if (ehVazia()) {
			System.out.println("Lista vazia!");
		} else {
			NoLista aux = inicio;
			while (aux != null) {
				System.out.print(aux.getInfo() + " ");
				aux = aux.getProx();
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
