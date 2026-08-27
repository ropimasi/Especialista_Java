package dev.ropimasi.curso.especialistajava.modulo18.aula19.agencia;

import java.util.Comparator;



public class PrecoHotelComparator implements Comparator<Hotel> {

	@Override
	public int compare(Hotel obj0, Hotel obj1) {
		return Double.compare(obj0.getPrecoDiaria(), obj1.getPrecoDiaria());
	}

}
