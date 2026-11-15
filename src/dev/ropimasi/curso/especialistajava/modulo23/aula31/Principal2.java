package dev.ropimasi.curso.especialistajava.modulo23.aula31;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal2 {

	public static void main(String[] args) {
		LocalDateTime dataHoraDaFesta = LocalDateTime.parse("2023-09-13T20:00:00");
		System.out.println(dataHoraDaFesta);
		
		ZonedDateTime dataHoraDaFestaFusoPadrao = ZonedDateTime.of(dataHoraDaFesta, ZoneId.systemDefault());
		System.out.println(dataHoraDaFestaFusoPadrao);
		
		// Mantem o LocalDateTime, não faz conversão.
		ZonedDateTime dataHoraDaFestaAmericaLosAngeles1 = ZonedDateTime.of(dataHoraDaFesta, ZoneId.of("America/Los_Angeles"));
		System.out.println(dataHoraDaFestaAmericaLosAngeles1);
		
		// Método de conveniência. Alternativa pra mesma coisa.
		ZonedDateTime dataHoraDaFestaAmericaLosAngeles2 = dataHoraDaFesta.atZone(ZoneId.of("America/Los_Angeles"));
		System.out.println(dataHoraDaFestaAmericaLosAngeles2);
		

	}

}
