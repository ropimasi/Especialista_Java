package dev.ropimasi.curso.especialistajava.modulo23.aula21;

import java.time.LocalDate;
import java.time.Year;

public class Principal1 {

	public static void main(String[] args) {
		// Formas de instanciar uma classe Year:
		Year ano1 = Year.now();
		Year ano2 = Year.of(2023);
		Year ano3 = Year.parse("2023");
		Year ano4 = Year.from(LocalDate.now());
		System.out.println(ano1);
		System.out.println(ano2);
		System.out.println(ano3);
		System.out.println(ano4);
		
		// Descobrir se um ano é bissexto:
		System.out.println(ano1.isLeap());
		System.out.println(Year.of(2024).isLeap());
		
		// Obter um LocalDate a partir de um Year:
		LocalDate data1 = ano1.atDay(256);
		LocalDate data2 = ano1.atMonth(2).atDay(28);
		System.out.println(data1);
		System.out.println(data2);

	}

}
