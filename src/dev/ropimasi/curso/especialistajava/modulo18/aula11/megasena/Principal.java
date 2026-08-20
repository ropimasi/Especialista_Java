package dev.ropimasi.curso.especialistajava.modulo18.aula11.megasena;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		Sorteador sorteador = new Sorteador();
		
		for (Integer i : sorteador) {
			System.out.println(i);
		}
		
//		Iterator<Integer> sorteadorIterator = sorteador.iterator();
//
//		while (sorteadorIterator.hasNext()) {
//			System.out.println(sorteadorIterator.next());
//		}
		
//		System.out.println(sorteadorIterator.next()); // espera-se que gera execption.
	}
}
