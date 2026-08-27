package dev.ropimasi.curso.especialistajava.modulo18.aula20.agencia;

import java.util.Comparator;



public class PrecoPacotesComparator implements Comparator<PacoteViagem> {

	@Override
	public int compare(PacoteViagem obj0, PacoteViagem obj1) {
		return Double.compare(obj0.getPrecoPorPessoa(), obj1.getPrecoPorPessoa());
	}

}
