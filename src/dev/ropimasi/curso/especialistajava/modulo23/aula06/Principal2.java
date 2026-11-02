package dev.ropimasi.curso.especialistajava.modulo23.aula06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal2 {

	public static void main(String[] args) {
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);
		
		LocalDate data1 = dataHora.toLocalDate();
		System.out.println(data1);
		
		LocalDate data2 = LocalDate.from(dataHora);
		System.out.println(data2);
		
		LocalTime hora1 = dataHora.toLocalTime();
		System.out.println(hora1);
		
		LocalTime hora2 = LocalTime.from(dataHora);
		System.out.println(hora2);

	}

}
