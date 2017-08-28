package i.atividade.lista.extra;

public class NoItem {

	private int codigo;
	private String nome;
	private double valor;
	private NoItem prox;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public NoItem getProx() {
		return prox;
	}

	public void setProx(NoItem prox) {
		this.prox = prox;
	}

}
