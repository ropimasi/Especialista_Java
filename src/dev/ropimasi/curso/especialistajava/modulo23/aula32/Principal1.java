package dev.ropimasi.curso.especialistajava.modulo23.aula32;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Principal1 {

	public static void main(String[] args) {
		OffsetDateTime dataHora1 = OffsetDateTime.now();
		System.out.println(dataHora1);
		System.out.println(dataHora1.getOffset());
		
		
		OffsetDateTime dataHora2 = OffsetDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(dataHora2);
		System.out.println(dataHora2.getOffset());
		
		
		OffsetDateTime dataHora3 = OffsetDateTime.now(ZoneOffset.ofHours(+5));
		System.out.println(dataHora3);
		System.out.println(dataHora3.getOffset());
		
		OffsetDateTime dataHora4 = OffsetDateTime.parse("2023-09-13T20:00:00-03:00");
		System.out.println(dataHora4);
		System.out.println(dataHora4.getOffset());

		OffsetTime hora1 = OffsetTime.now();
		OffsetTime hora2 = OffsetTime.now(ZoneId.of("America/Los_Angeles"));
		OffsetTime hora3 = OffsetTime.now(ZoneOffset.ofHours(+5));
		OffsetTime hora4 = OffsetTime.parse("20:00:00-03:00");
		
		System.out.println(hora1);
		System.out.println(hora1.getOffset());
		System.out.println(hora2);
		System.out.println(hora2.getOffset());
		System.out.println(hora3);
		System.out.println(hora3.getOffset());
		System.out.println(hora4);
		System.out.println(hora4.getOffset());
		
	}

}
