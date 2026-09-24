package dev.ropimasi.curso.especialistajava.modulo20.aula08;

public class ValidadorEmail {

	public static boolean validar(String email) {
		// Exemplo de email válido: Nome_do-123.email@dominio-do.123email.ext.br

		// Validar se o email é nulo ou vazio = false;
		if (emailNuloOuVazio(email)) {
			return false;
		}
		
		// Validar se o email contém espaços em branco = false;
		if (emailContemEspacosEmBranco(email)) {
			return false;
		}		
		
		// Validar se o email contém exatamente um @ = true;
		if (!emailContemUmArroba(email)) {
			return false;
		}
		
		// Validar se o @ está no início ou no final do email = false;
		if (emailArrobaNoInicioOuFim(email)) {
			return false;
		}

		// Validar se o domínio do email contém pelo menos um ponto = true;
		if (contarPontosNoDominioSufixo(email) < 1) {
			return false;
		}
		
		
		// Extrair as partes do email: nome-do-usuario, nome-do-domínio e sufixo.
		String nomeDoUsuario = extrairNomeDoUsuario(email);
		String nomeDoDominio = extrairNomeDoDominio(email);
		String sufixoDoDominio = extrairSufixoDoDominio(email);
				
		
		// Validar se o nome do usuário contém apenas letras, números, pontos, traços e underscores = true;
		if (!somenteLetrasNumerosPontosTracosUnderscores(nomeDoUsuario)) {
			return false;
		}
				
		// Validar se o nome do usuário inicia ou termina com ponto, traço ou underscore = false;
		if (iniciaOuTerminaComPontoTracoUnderscore(nomeDoUsuario)) {
			return false;
		}
		
		// Validar se o nome do usuário contém pelo menos um caractere = true;
		if (nomeDoUsuario.length() < 1) {
			return false;
		}

		// Validar se o domínio do email contém apenas letras minúsculas, números, pontos e traços = true;
		if (!somenteLetrasMinusculasNumerosPontosTracos(nomeDoDominio)) {
			return false;
		}
		
		// Validar se o domínio do email inicia ou termina com ponto ou traço = false;
		if (dominioPontoTracoNoInicioOuFim(nomeDoDominio)) {
			return false;
		}		
		
		// Validar se o domínio do email contém pelo menos um caracteres = true;
		if (nomeDoDominio.length() < 1) {
			return false;
		}
		
		// Validar se o sufixo do dominio é composto por apenas letras minúsculas. Sem utilizar REGEX.
		if (!somenteLetrasMinusculas(sufixoDoDominio)) {
			return false;
		}
		
		// Validar se o sufixo do domínio contém pelo menos 2 caracteres e no máximo 3 caracteres
		// , ou, pelo menos 2 caracteres e no máximo 3 caracteres seguido de um "." e mais 2 caracteres = true;
		if (!validarSufixoDoDominioMaximoTresMaisDoisCaracteres(sufixoDoDominio)) {
			return false;
		}
		
		
		return true;
	}


	private static boolean emailNuloOuVazio(String email) {
		return email == null || email.isEmpty();
	}


	private static boolean emailContemEspacosEmBranco(String email) {
		return email.contains(" ");
	}


	private static boolean emailContemUmArroba(String email) {
		return email.chars().filter(c -> c == '@').count() == 1;
	}


	private static boolean emailArrobaNoInicioOuFim(String email) {
		return email.startsWith("@") || email.endsWith("@");
	}

	private static boolean dominioPontoTracoNoInicioOuFim(String dominio) {
		return dominio.startsWith(".") || dominio.startsWith("-") || dominio.endsWith(".") || dominio.endsWith("-");
	}

	private static String extrairNomeDoUsuario(String email) {
		return email.substring(0, email.indexOf("@"));
	}

	// Método que extrai a segunda parte do email, após o @.
	private static String extrairDominioExtensao(String email) {
		return email.substring(email.indexOf("@") + 1);
	}

	
	// Método que conta quantos "." existem na segunda parte do email, após o @.
	private static long contarPontosNoDominioSufixo(String email) {
		return email.substring(email.indexOf("@") + 1).chars().filter(c -> c == '.').count();
	}


	// Método que retorna a posição da penúltima ocorrência do caractere passado como parâmetro na String passada como parâmetro.
	private static int penultimaOcorrenciaPonto(String str) {
		int ultimaOcorrencia = str.lastIndexOf(".");
		if (ultimaOcorrencia == -1) {
			return -1;
		}
		return str.lastIndexOf(".", ultimaOcorrencia - 1);
	}


	private static String extrairNomeDoDominio(String email) {
		// Depende de quantos "." existem na segunda parte do email, após o @.
		
		System.out.println("DEBUG: " + email);
		
		if (contarPontosNoDominioSufixo(email) == 1) {
			return email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        } else if ((contarPontosNoDominioSufixo(email) > 1)
        		&& (extrairSufixoDoDominio(email).length() > 3)) {          
        	return email.substring(email.indexOf("@") + 1, penultimaOcorrenciaPonto(email));
		} else {
			return email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
		}
	}


	private static String extrairSufixoDoDominio(String email) {
		// Depende de quantos "." existem na segunda parte do email, após o @.
		if (contarPontosNoDominioSufixo(email) == 1) {
			return email.substring(email.lastIndexOf(".") + 1);
		} else if (contarPontosNoDominioSufixo(email) > 1) {
			String verificarSubStr =  email.substring(penultimaOcorrenciaPonto(email) + 1);
			if (verificarSubStr.length() > 6) {
				return email.substring(email.lastIndexOf(".") + 1);
			} else {
				return verificarSubStr;
			}
		}
		return "";
	}
	
	
	// Método que valida se o nome do usuario contém apenas letras, números, pontos, traços e underscores = true;
	private static boolean somenteLetrasNumerosPontosTracosUnderscores(String nomeDoUsuario) {
		if (nomeDoUsuario == null || nomeDoUsuario.isEmpty()) {
			return false;
		}
		for (char c : nomeDoUsuario.toCharArray()) {
			if (!Character.isLetter(c) && !Character.isDigit(c) && c != '.' && c != '-' && c != '_') {
				return false;
			}
		}
		return true;
    }
	
	
	// Método que valida se o nome do usuário inicia ou termina com ponto, traço ou underscore = false;
	private static boolean iniciaOuTerminaComPontoTracoUnderscore(String nomeDoUsuario) {
		if (nomeDoUsuario == null || nomeDoUsuario.isEmpty()) {
			return false;
		}
		return nomeDoUsuario.startsWith(".") || nomeDoUsuario.startsWith("-") || nomeDoUsuario.startsWith("_")
				|| nomeDoUsuario.endsWith(".") || nomeDoUsuario.endsWith("-") || nomeDoUsuario.endsWith("_");
	}
	
	
	// Método que valida se o domínio do email contém apenas letras minúsculas, números, pontos e traços = true;
	private static boolean somenteLetrasMinusculasNumerosPontosTracos(String dominioDoEmail) {
		if (dominioDoEmail == null || dominioDoEmail.isEmpty()) {
			return false;
		}
		for (char c : dominioDoEmail.toCharArray()) {
			if (!Character.isLetter(c) && !Character.isDigit(c) && c != '.' && c != '-') {
				return false;
			}
			if (Character.isLetter(c) && !Character.isLowerCase(c)) {
				return false;
			}
		}
		return true;
    }
	
	
	// Método que valida se o sufixo do domínio contém apenas letras minúsculas = true;
	private static boolean somenteLetrasMinusculas(String sufixoDoDominio) {
		if (sufixoDoDominio == null || sufixoDoDominio.isEmpty()) {
			return false;
		}
		for (char c : sufixoDoDominio.toCharArray()) {
			if (!Character.isLetter(c)) {
				return false;
			}
			if (Character.isLetter(c) && !Character.isLowerCase(c)) {
				return false;
			}
		}
		return true;
    }
	
	
	// Validar se o sufixo do domínio contém pelo menos 2 caracteres e no máximo 3 caracteres,
	// ou, pelo menos 2 caracteres e no máximo 3 caracteres seguido de um "." e mais 2 caracteres = true;
	private static boolean validarSufixoDoDominioMaximoTresMaisDoisCaracteres(String sufixoDoDominio) {
		if ( (!(sufixoDoDominio.length() >= 2 && sufixoDoDominio.length() <= 3))
				&& (!(sufixoDoDominio.length() >= 4 && sufixoDoDominio.length() <= 6
				&& contarPontosNoDominioSufixo(sufixoDoDominio) == 1))) {
			return false;
		}
		return true;
	}
	

}















//