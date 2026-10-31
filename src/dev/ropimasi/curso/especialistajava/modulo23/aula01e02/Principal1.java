package dev.ropimasi.curso.especialistajava.modulo23.aula01e02;

import java.time.Instant;



public class Principal1 {

	public static void main(String[] args) {

		// Estudo sobre a DateTime API do Java 8.

		// Criando uma data e hora atual
		Instant agora = Instant.now(); // Só trabalha com UTC. Com ISO 8601.
		System.out.println("Data e hora atual: " + agora);

		System.out.println("Época em segundos: " + agora.getEpochSecond());
		System.out.println("Nanossegundos complementar: " + agora.getNano());
		System.out.println("Época em milissegundos: " + agora.toEpochMilli());
		System.out.println("Current Time em Millis: " + System.currentTimeMillis());
	}

}
