package dev.ropimasi.curso.especialistajava.modulo23.aula08;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalTime {

	public static void main(String[] args) {
		
		LocalTime hora1 = LocalTime.parse("10:15:30");
		System.out.println(hora1);
		
		LocalTime hora2 = LocalTime.parse("10:15:30.123456789", DateTimeFormatter.ofPattern("HH:mm:ss.nnnnnnnnn"));
		System.out.println(hora2);
		
	}

}
