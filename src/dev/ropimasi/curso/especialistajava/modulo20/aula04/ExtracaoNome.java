package dev.ropimasi.curso.especialistajava.modulo20.aula04;

public class ExtracaoNome {

	public static void main(String[] args) {
		String nome = "João Silva Souza"; // Silva Souza

		System.out.println("Nome completo: " + nome);
		System.out.println("Primeiro nome: " + extrairPrimeiroNome(nome));
		System.out.println("Segundo nome: " + extrairSegundoNome(nome));
		//		System.out.println("Último nome: " + extrairUltimoNome(nome));
		System.out.println("Sobrenome: " + extrairSobrenome(nome));

	}


	// Extrair o primeiro nome usando .indexOf() e .substring().
	private static String extrairPrimeiroNome(String nome) {
		int posicaoPrimeiroEspaco = nome.indexOf(" ");
		if (posicaoPrimeiroEspaco == -1) {
			return nome;
		}
		String rtnPrimeiroNome = nome.substring(0, posicaoPrimeiroEspaco);
		if (rtnPrimeiroNome.isBlank()) {
			throw new RuntimeException("Nome inválido.");
		}
		return rtnPrimeiroNome;
	}


	// Extrair o segundo nome usando .indexOf() e .substring().
	private static String extrairSegundoNome(String nome) {
		int posicaoPrimeiroEspaco = nome.indexOf((" "));
		if (posicaoPrimeiroEspaco == -1) {
			throw new RuntimeException("Nome não é completo.");
		}
		int posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);
		if (posicaoSegundoEspaco == -1) {
			posicaoSegundoEspaco = nome.length();
		}

		String rtnSegundoNome = nome.substring(posicaoPrimeiroEspaco + 1, posicaoSegundoEspaco);
		if (rtnSegundoNome.isBlank()) {
			throw new RuntimeException("Nome não é completo.");
		}
		return rtnSegundoNome;
	}


	// Extrair o sobrenome usando .indexOf() e .substring().
	private static String extrairSobrenome(String nome) {
		int posicaoPrimeiroEspaco = nome.indexOf(" ");
		if (posicaoPrimeiroEspaco == -1) {
			throw new RuntimeException("Nome não é completo.");
		}
		String rtnSobrenome = nome.substring(posicaoPrimeiroEspaco + 1);
		if (rtnSobrenome.isBlank()) {
			throw new RuntimeException("Nome não é completo.");
		}
		return rtnSobrenome;
	}

}
