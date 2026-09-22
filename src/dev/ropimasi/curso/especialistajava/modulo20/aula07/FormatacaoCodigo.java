package dev.ropimasi.curso.especialistajava.modulo20.aula07;

public class FormatacaoCodigo {

	public static void main(String[] args) {
//		long codigo = 123456789000L;
		long codigo = 123L;
		
		String codigoFormatado = preencherEsquerda(String.valueOf(codigo), '0', 10); 
		
		System.out.println(codigoFormatado);

	}

	private static String preencherEsquerda(String texto, char caracter, int tamanhoTotal) {
		return String.valueOf(caracter).repeat(Math.max(0, tamanhoTotal - texto.length())) + texto;
	}

}
