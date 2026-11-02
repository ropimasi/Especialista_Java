package dev.ropimasi.curso.especialistajava.modulo23.aula06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal1 {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2023, 6, 15);
		LocalTime hora = LocalTime.of(10, 30, 0);
		
		LocalDateTime dataHora1 = LocalDateTime.of(data, hora);
		LocalDateTime dataHora2 = data.atTime(hora);
		LocalDateTime dataHora3 = hora.atDate(data);

		System.out.println(dataHora1);
		System.out.println(dataHora2);
		System.out.println(dataHora3);
		
		
	}

}
