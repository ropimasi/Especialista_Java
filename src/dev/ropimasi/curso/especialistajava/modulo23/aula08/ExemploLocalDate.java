package dev.ropimasi.curso.especialistajava.modulo23.aula08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDate {

	public static void main(String[] args) {
		
		LocalDate data1 = LocalDate.parse("2023-06-15");
		System.out.println(data1);
		
		LocalDate data2 = LocalDate.parse("15/06/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(data2);
		
	}
	
}
