package dev.ropimasi.curso.especialistajava.modulo23.aula31;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Principal1 {

	public static void main(String[] args) {
		ZonedDateTime dataHraFusoPadrão = ZonedDateTime.now();
		System.out.println(dataHraFusoPadrão);
		
		LocalDateTime dataHoraSemFuso = dataHraFusoPadrão.toLocalDateTime();
		System.out.println(dataHoraSemFuso);
		
		

	}

}
