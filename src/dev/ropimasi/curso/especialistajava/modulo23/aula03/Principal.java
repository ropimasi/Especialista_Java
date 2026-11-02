package dev.ropimasi.curso.especialistajava.modulo23.aula03;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		LocalDate dataHoje = LocalDate.now();
		System.out.println("Data de hoje: " + dataHoje);

		LocalDate dataNascimento = LocalDate.of(1980, 7, 25);
		System.out.println("Data de nascimento: " + dataNascimento);
		
		LocalDate dataDoProgramador = LocalDate.ofYearDay(2026, 256);
		System.out.println("Dia do programador: " + dataDoProgramador);
		
		
		
	}

}
