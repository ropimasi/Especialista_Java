package dev.ropimasi.curso.especialistajava.modulo23.aula11;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Principal {

	public static void main(String[] args) {
		
		LocalDateTime dataHoraAgora = LocalDateTime.now();
		LocalDateTime dataHoraEditada1 = dataHoraAgora.with(ChronoField.DAY_OF_MONTH, 12);
		
		System.out.println(dataHoraAgora);
		System.out.println(dataHoraEditada1);
		
		LocalDateTime dataHoraEditada2 = dataHoraEditada1.withDayOfMonth(9)
				.withMinute(0)
				.withSecond(0);

		System.out.println(dataHoraEditada2);
	}

}
