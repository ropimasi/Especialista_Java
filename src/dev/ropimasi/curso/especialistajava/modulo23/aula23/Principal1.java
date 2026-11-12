package dev.ropimasi.curso.especialistajava.modulo23.aula23;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public class Principal1 {

	public static void main(String[] args) {
		// Formas de instanciar uma classe MonthDay:
		MonthDay md1 = MonthDay.now();
		MonthDay md2 = MonthDay.of(2, 29);
		MonthDay md3 = MonthDay.of(2, 28);
		MonthDay md4 = MonthDay.from(LocalDate.now());
		MonthDay md5 = MonthDay.parse("--02-27");
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		System.out.println(md4);
		System.out.println(md5);		

		// Obter um LocalDate a partir de um MonthDay:
		LocalDate dataAniversario1 = md3.atYear(2023);
		System.out.println(md3 + " : " + dataAniversario1);
		
		LocalDate dataAniversario2 = Year.now().atMonthDay(md3); // Alternativa.
		System.out.println(md3 + " : " + dataAniversario2);		
		
		LocalDate dataAniversario3 = md2.atYear(2023);
		System.out.println(md2 + " : " + dataAniversario3); // Ausência de 29/02 em 2023, portanto, retorna 28/02/2023.
		
		LocalDate dataAniversario4 = md2.atYear(2024);
		System.out.println(md2 + " : " + dataAniversario4);
		
	}

}
