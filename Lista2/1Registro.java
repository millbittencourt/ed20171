package br.ucsal.ed.quest01;

public class Registro {


	public Registro(String descrição, Integer qtdAlunos, Double valorMensalidade) {
		super();
		this.descrição = descrição;
		this.qtdAlunos = qtdAlunos;
		this.valorMensalidade = valorMensalidade;
	}

	private String descrição;
	private Integer qtdAlunos;
	private Double valorMensalidade;

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Integer getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(Integer qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public Double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(Double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

}
