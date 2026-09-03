package dev.ropimasi.curso.especialistajava.modulo18.aula26.crm;

import java.util.Comparator;

public class IdadeContatoComparator implements Comparator<Contato> {

	@Override
	public int compare(Contato arg0, Contato arg1) {
		System.out.println("Comparator Comparando " + arg0 + " com " + arg1);
		return Integer.compare(arg0.getIdade(), arg1.getIdade());
	}

}
