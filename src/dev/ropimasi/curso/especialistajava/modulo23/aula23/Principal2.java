package dev.ropimasi.curso.especialistajava.modulo23.aula23;

import java.time.MonthDay;
import java.time.Year;

public class Principal2 {

	public static void main(String[] args) {
		// Verificar se um MonthDay é válido para um determinado ano:
		MonthDay md1 = MonthDay.of(2, 29);
		Year year1 = Year.of(2023);
		Year year2 = Year.of(2024);
		
		System.out.println(year1.isValidMonthDay(md1)); // false
		System.out.println(year2.isValidMonthDay(md1)); // true

		System.out.println(md1.isValidYear(year1.getValue())); // false
		System.out.println(md1.isValidYear(year2.getValue())); // true
		
	}

}
