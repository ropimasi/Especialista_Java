package dev.ropimasi.curso.especialistajava.modulo23.aula01e02;

import java.time.Instant;
import java.util.Date;

public class Principal2 {

	public static void main(String[] args) {
		
		// Converter um objeto Instant para Date.
		Instant instante = Instant.now();
		Date data = Date.from(instante);
		
		System.out.println("Instant: " + instante);
		System.out.println("Date: " + data);
	}

}
