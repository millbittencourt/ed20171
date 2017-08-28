package i.atividade.lista.extra;

public class Q1 {

	public int ultimaOcorrencia(String s, char c) {
		String vet[] = new String[s.length()];
		int j = 1;
		String t = String.valueOf(c);
		for (int i = 0; i < vet.length; i++) {
			vet[i] = s.substring(i, j);
			System.out.print(vet[i]);
			j++;
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (vet[i].equals(t)) {
				System.out.println("\n\nCaracter '" + t + "' no índice: ");
				return i;
			}
		}
		System.out.println();
		return -1;
	}
}
