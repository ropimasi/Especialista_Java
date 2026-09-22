package dev.ropimasi.curso.especialistajava.modulo20.aula07;

public class FormatacaoNome {

	public static void main(String[] args) {
		
		// método para formatar um nome.
		String nome = "    José da Silva de Souza dos Santos    ";
		
		System.out.println(formatarNome(nome, "da", "de", "do", "dos"));
		

	}
	
	public static String formatarNome(String nome, String...preposicoesParaExclusao) {
		String nomeFormatado = nome.strip().toUpperCase();
		
		for (String preposicao : preposicoesParaExclusao) {
			nomeFormatado = nomeFormatado.replaceAll(" " + preposicao.toUpperCase() + " ", " ");
		}
		
		return nomeFormatado;
	}

}
