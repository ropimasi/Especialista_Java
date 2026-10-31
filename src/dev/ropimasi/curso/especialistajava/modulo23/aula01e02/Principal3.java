package dev.ropimasi.curso.especialistajava.modulo23.aula01e02;

import java.time.Instant;
import java.util.Calendar;



public class Principal3 {

	public static void main(String[] args) {

		// Converter um objeto Instant para Date.
		Calendar calendario = Calendar.getInstance();
		Instant instante = calendario.toInstant();

		System.out.println("Calendar: " + calendario.getTime());
		System.out.println("Instant: " + instante);
	}

}
