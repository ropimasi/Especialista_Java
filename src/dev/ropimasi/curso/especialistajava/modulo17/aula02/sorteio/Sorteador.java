package dev.ropimasi.curso.especialistajava.modulo17.aula02.sorteio;

import java.util.Random;




public class Sorteador {

	private static final Random RANDOM = new Random();



	public static <T> T sortear(T[] objetos) {
		if (objetos.length == 0) {
			throw new IllegalArgumentException("Mínimo de 1 objeto requerido");
		}

		int posicao = RANDOM.nextInt(objetos.length);
		return objetos[posicao];
	}

}