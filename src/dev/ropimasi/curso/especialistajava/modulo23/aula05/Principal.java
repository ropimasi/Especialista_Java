package dev.ropimasi.curso.especialistajava.modulo23.aula05;

import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {
		
		LocalDateTime dataHora= LocalDateTime.now();
		System.out.println("Data e hora de agora: " + dataHora); // padrão ISO 8601.
		
		LocalDateTime dataHoraFutura= LocalDateTime.of(2026, 12, 24, 23, 59, 50);
		System.out.println("Data e hora futura: " + dataHoraFutura);

	}

}
