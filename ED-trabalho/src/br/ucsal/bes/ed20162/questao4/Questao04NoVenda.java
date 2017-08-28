package br.ucsal.bes.ed20162.questao4;

import java.util.Date;

	public class Questao04NoVenda {

	private int codigo;
	private float valor;
	private Date data;
	private Questao04NoVenda prox;
	private Questao04NoItem item;

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
	public Questao04NoVenda getProx() {
		return prox;
	}
	public void setProx(Questao04NoVenda prox) {
		this.prox = prox;
	}
	public Questao04NoItem getItem() {
		return item;
	}
	public void setItem(Questao04NoItem item) {
		this.item = item;
	}

	}

