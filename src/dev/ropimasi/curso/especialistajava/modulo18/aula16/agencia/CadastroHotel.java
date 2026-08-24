package dev.ropimasi.curso.especialistajava.modulo18.aula16.agencia;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class CadastroHotel {

	private final List<Hotel> hoteis = new LinkedList<>();


	public void adicionar(String nome, String cidade, double precoDiaria) {
		Hotel hotel = new Hotel(nome, cidade, precoDiaria);

		if (hoteis.contains(hotel)) {
			throw new HotelJaExistenteException(String.format("O hotel %s já foi adicionado.", hotel.getNome()));
		}

		hoteis.add(hotel);
	}


	public List<Hotel> obterTodos() {
		return hoteis;
	}


	public Hotel[] obterTodosComoArray() {
		return hoteis.toArray(new Hotel[0]);
		
//		Hotel[] hoteis2 = new Hotel[hoteis.size()];
//		for (int i = 0; i < hoteis.size(); i++) {
//			hoteis2[i] = hoteis.get(i);
//		}
//		return hoteis2;
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
