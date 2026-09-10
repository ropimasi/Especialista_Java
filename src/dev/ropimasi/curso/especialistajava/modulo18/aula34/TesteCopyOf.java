package dev.ropimasi.curso.especialistajava.modulo18.aula34;

import java.util.ArrayList;
import java.util.List;



public class TesteCopyOf {

	public static void main(String[] args) {
		List<Integer> numeros1 = new ArrayList<>();
		numeros1.add(1);
		numeros1.add(2);
		numeros1.add(3);
		List<Integer> numeros2 = List.copyOf(numeros1);
		
		System.out.println(numeros1);
		System.out.println(numeros2);
		
		numeros1.add(4);
//		numeros2.add(5); // UnsuportedOperationException.

		System.out.println(numeros1);
		System.out.println(numeros2);
	}

}
