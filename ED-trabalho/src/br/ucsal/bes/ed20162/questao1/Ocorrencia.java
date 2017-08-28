package br.ucsal.bes.ed20162.questao1;

public class Ocorrencia {

	public Integer ultimaOcorrencia(String s, char c){
		int i;
		for(i=0; i<s.length();i++){
			if(s.charAt(i) == c){
				return i; 
			}else if(i == -1){
				return -1;
			}
		}
		return null;
	}

}
