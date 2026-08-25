package dev.ropimasi.curso.especialistajava.modulo18.aula17e18;

import dev.ropimasi.curso.especialistajava.modulo18.aula17e18.agencia.Hotel;



public class Principal2 {

	public static void main(String[] args) {

		Hotel hotel1 = new Hotel("Vila Selvagem", "Fortim/CE", 1400);
		Hotel hotel2 = new Hotel("Vila Selvagem", "Fortim/CE", 1500);

		System.out.println(hotel1.compareTo(hotel2));
	}

}
