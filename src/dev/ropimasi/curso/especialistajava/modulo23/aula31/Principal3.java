package dev.ropimasi.curso.especialistajava.modulo23.aula31;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal3 {

	public static void main(String[] args) {
		ZonedDateTime dataHoraFusoSaoPaulo = ZonedDateTime
				.parse("2022-11-20T20:00:00-03:00[America/Sao_Paulo]");

		// Faz a conversão do horário para manter o instant.
		Instant instante = dataHoraFusoSaoPaulo.toInstant();
		System.out.println(instante);

		// Faz a conversão do horário para manter o instant.
		LocalDateTime dataHoraLocalLosAngeles = LocalDateTime
				.ofInstant(instante, ZoneId.of("America/Los_Angeles"));
		System.out.println(dataHoraLocalLosAngeles);
	}
	
	

}
