package q02;

public class Aluno {

	private Integer codigo;
	private Integer pontuacao;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + " Pontuação: " + pontuacao + " |";
	}
}
