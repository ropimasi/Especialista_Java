package dev.ropimasi.curso.especialistajava.modulo23.aula01e02;

import java.time.Instant;
import java.util.Date;

public class Principal4 {

	public static void main(String[] args) {
		
		// Converter um objeto Instant para Date.
		Date data = new Date();
		Instant instante = data.toInstant();
		
		System.out.println("Date: " + data);
		System.out.println("Instant: " + instante);
	}

}
