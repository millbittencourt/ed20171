package i.atividade.lista.extra;

import java.util.Date;

public class NoVenda {
	private int codigo;
	private float valor;
	private Date data;
	private NoVenda prox;
	private NoItem inicio;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public NoVenda getProx() {
		return prox;
	}
	public void setProx(NoVenda prox) {
		this.prox = prox;
	}
	public NoItem getInicio() {
		return inicio;
	}
	public void setInicio(NoItem inicio) {
		this.inicio = inicio;
	}
	
}
