package dev.ropimasi.curso.especialistajava.modulo23.aula08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime dateTime1 = LocalDateTime.parse("2023-06-15T10:15:30");
		System.out.println(dateTime1);
		
		LocalDateTime dateTime2 = LocalDateTime.parse("15/06/2026 10:15:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		System.out.println(dateTime2);
		
	}
}
