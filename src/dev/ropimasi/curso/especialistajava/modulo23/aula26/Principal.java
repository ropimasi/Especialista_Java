package dev.ropimasi.curso.especialistajava.modulo23.aula26;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistDate;

public class Principal {

	public static void main(String[] args) {
		// Comparar dois objetos temporais:
		LocalDate data1 = LocalDate.of(2023, 6, 1);
		LocalDate data2 = LocalDate.of(2023, 6, 1);
		
		System.out.println(data1);
		System.out.println(data2);
		
		System.out.println(data1.equals(data2)); // true
		System.out.println(data1 == data2); // false
		
		ThaiBuddhistDate data3Thai = ThaiBuddhistDate.from(data1);
		System.out.println(data3Thai);
		
		System.out.println(data1.equals(data3Thai)); // false
		// System.out.println(data1 == data3Thai); // Tipos incompatíveis.
		System.out.println(data1.isEqual(data3Thai)); // true
		// Este método a cima compara os dois objetos temporais, mesmo que sejam de tipos diferentes,
		// e retorna true se representarem a mesma data.
		
		LocalDate hoje = LocalDate.now();
		LocalDate depoisDeAmanha = LocalDate.now().plusDays(2);
		System.out.println(hoje);
		System.out.println(depoisDeAmanha);
		
		System.out.println(hoje.isBefore(depoisDeAmanha)); // true
		System.out.println(hoje.isAfter(depoisDeAmanha)); // false
		
		if (hoje.compareTo(depoisDeAmanha) < 0) {
			System.out.println("Hoje é antes de depois de amanhã");
		} else if (hoje.compareTo(depoisDeAmanha) > 0) {
			System.out.println("Hoje é depois de depois de amanhã");
		} else {
			System.out.println("Hoje é igual a depois de amanhã");
		}
		
		
	}

}
