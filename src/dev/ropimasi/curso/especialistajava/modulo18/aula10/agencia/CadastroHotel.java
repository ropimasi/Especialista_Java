package dev.ropimasi.curso.especialistajava.modulo18.aula10.agencia;

import java.util.ArrayList;
import java.util.Iterator;



public class CadastroHotel {

	private final ArrayList<Hotel> hoteis = new ArrayList<>();


	public void adicionar(String nome, String cidade, double precoDiaria) {
		Hotel hotel = new Hotel(nome, cidade, precoDiaria);

		if (hoteis.contains(hotel)) {
			throw new HotelJaExistenteException(String.format("O hotel %s já foi adicionado.", hotel.getNome()));
		}

		hoteis.add(hotel);
	}


	public ArrayList<Hotel> obterTodos() {
		return hoteis;
	}


	public void removerPorCidade(String cidade) {
		Iterator<Hotel> hotelIterator = hoteis.iterator();

		while (hotelIterator.hasNext()) {
			Hotel hotel = hotelIterator.next();
			if (hotel.getCidade().equals(cidade)) {
				hotelIterator.remove(); // vai remover exatamente o elemento que foi retornado pelo next() do iterator.
			}

		}
	}


	public void remove(Hotel hotel) {
		boolean removido = hoteis.remove(hotel);

		if (!removido) {
			throw new HotelNaoEncontradoException(String.format("O hotel %s não foi encontrado.", hotel.getNome()));
		}
	}


	public void removerTodos() {
		hoteis.clear();
	}

}
