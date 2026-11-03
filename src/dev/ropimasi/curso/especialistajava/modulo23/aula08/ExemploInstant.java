package dev.ropimasi.curso.especialistajava.modulo23.aula08;

import java.time.Instant;

public class ExemploInstant {

	public static void main(String[] args) {
		
		Instant instante1 = Instant.parse("2023-06-01T10:15:30.00Z");
		Instant instante2 = Instant.parse("2023-06-01T10:15:30.00-03:00");
		
		System.out.println("Instante 1: " + instante1);
		System.out.println("Instante 2: " + instante2);
		
	}

}
