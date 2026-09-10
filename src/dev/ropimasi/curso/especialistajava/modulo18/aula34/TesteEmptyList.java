package dev.ropimasi.curso.especialistajava.modulo18.aula34;

import java.util.Collections;
import java.util.List;



public class TesteEmptyList {

	public static void main(String[] args) {
		List<Integer> numeros = Collections.emptyList();
//		numeros.add(3); // UnsupportedOperationException.

		System.out.println(numeros);
	}

}
