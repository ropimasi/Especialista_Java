package dev.ropimasi.curso.especialistajava.modulo23.aula04;

import java.time.LocalTime;

public class Principal {

	public static void main(String[] args) {
		LocalTime horaAgora = LocalTime.now();
		System.out.println(horaAgora);

		LocalTime horaReuniao = LocalTime.of(9, 30, 15);
		System.out.println("Hora da reunião: " + horaReuniao);
		
	}
	
}
