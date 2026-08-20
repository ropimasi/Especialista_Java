package dev.ropimasi.curso.especialistajava.modulo18.aula11.megasena;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

	
	private static final Random RANDOM = new Random();
	private int quantidadeSorteada = 0;
	
	
	@Override
	public boolean hasNext() {
		return quantidadeSorteada < 6; // pois queremos que sorteie 6 números.
	}

	@Override
	public Integer next() {
		if (!hasNext()) {
			throw new NoSuchElementException("Não há mais números a serem sorteados.");
		}
		
		quantidadeSorteada++;
		return RANDOM.nextInt(60);
	}

}
