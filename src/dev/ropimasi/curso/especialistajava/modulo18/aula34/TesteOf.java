package dev.ropimasi.curso.especialistajava.modulo18.aula34;

import java.util.List;



public class TesteOf {

	public static void main(String[] args) {
		List<Integer> numeros1 = List.of(1, 2);
		List<Integer> numeros2 = List.of(); // Lista vazia.
		
		//        numeros1.add(3); // UnsuportedOperationException.
		//        numeros2.add(1); // UnsuportedOperationException.

		System.out.println(numeros1);
		System.out.println(numeros2);
	}

}
