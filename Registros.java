package br.ucsal.ed.avaliacao1.questao2;

public class Registros {

	private static Integer codigo;
	private static String nome;
	private static Integer codigoCargo;

	Registros() {

	}

	public static Integer getCodigo() {
		return codigo;
	}

	public static void setCodigo(Integer codigo) {
		Registros.codigo = codigo;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Registros.nome = nome;
	}

	public static Integer getCodigoCargo() {
		return codigoCargo;
	}

	public static void setCodigoCargo(Integer codigoCargo) {
		Registros.codigoCargo = codigoCargo;
	}

}
