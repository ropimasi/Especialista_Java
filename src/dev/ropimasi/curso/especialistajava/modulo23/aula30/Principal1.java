package dev.ropimasi.curso.especialistajava.modulo23.aula30;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal1 {

	public static void main(String[] args) {
		ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now(); // DateTime do meu O.S. local.
		System.out.println(dataHoraFusoPadrao);

		ZonedDateTime dataHoraLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(dataHoraLosAngeles);
		
		System.out.println(dataHoraFusoPadrao.getOffset());
		System.out.println(dataHoraFusoPadrao.getZone());
		
		
	}

}
