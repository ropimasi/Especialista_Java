package dev.ropimasi.curso.especialistajava.modulo20.aula09;

import java.util.regex.Pattern;

public class Teste {

	public static void main(String[] args) {
		
		String email = "A-b.c123@alga.work-s.com";
		
		boolean valido = Pattern.matches("[\\w.-]+@[a-z0-9.-]+\\.[a-z]{2,3}", email);
		
		System.out.println(valido);
		
	}
}
