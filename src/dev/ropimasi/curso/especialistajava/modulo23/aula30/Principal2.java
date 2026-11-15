package dev.ropimasi.curso.especialistajava.modulo23.aula30;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal2 {

	public static void main(String[] args) {
		ZonedDateTime dataFestaFusoSaoPaulo = ZonedDateTime
				.parse("2023-09-13T20:00:00-03:00[America/Sao_Paulo]");
		
		System.out.println(dataFestaFusoSaoPaulo);
		
		ZonedDateTime dataFestaLosAngeles1 = dataFestaFusoSaoPaulo
				.withZoneSameLocal(ZoneId.of("America/Los_Angeles"));
		
		System.out.println(dataFestaLosAngeles1);
		
		ZonedDateTime dataFestaLosAngeles2 = dataFestaFusoSaoPaulo
				.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		
		System.out.println(dataFestaLosAngeles2);
		
		// Compara se os dois objetos são iguais.
		System.out.println(dataFestaFusoSaoPaulo.equals(dataFestaLosAngeles2));
		
		// Compara se os dois instantes são o mesmo.
		System.out.println(dataFestaFusoSaoPaulo.isEqual(dataFestaLosAngeles2));

	}

}
