package dev.ropimasi.curso.especialistajava.modulo20.aula09;

public class ValidadorEmail {

	public static boolean validar(String email) {
		return email.matches("[\\w.-]+@[a-z0-9.-]+\\.[a-z]{2,3}");
	}
	

}















//