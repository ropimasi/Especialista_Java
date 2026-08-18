package dev.ropimasi.curso.especialistajava.modulo18.aula08.agencia;

import java.util.ArrayList;



public class CadastroHotel {

	private final ArrayList<Hotel> hoteis = new ArrayList<>();


	public void adicionar(String nome, String cidade, double precoDiaria) {
		Hotel hotel = new Hotel(nome, cidade, precoDiaria);

		if (hoteis.contains(hotel)) {
			throw new HotelJaExistenteException(String.format("O hotel %s já foi adicionado.", hotel.getNome()));
		}

		//hoteis.add(0, hotel);
		hoteis.add(hotel);
	}


	public ArrayList<Hotel> obterTodos() {
		return hoteis;
	}

	
	
	public void removerPorCidade(String cidade) {
		ArrayList<Hotel> hoteisParaRemover = new ArrayList<>();
		
		for (int i = 0; i < hoteis.size(); i++) {
			Hotel hotel = hoteis.get(i);
			if (hotel.getCidade().equals(cidade)) {
				//hoteis.remove(i);
				/* após remoção do elemento da lista é necessário decrementar o índice para não pular o
				próximo elemento. */
				//i--;
				hoteisParaRemover.add(hotel);
			}
		}
		
		hoteis.removeAll(hoteisParaRemover);
	}
	
	
	
	public void remove(Hotel hotel ) {
		/*if (hoteis.contains(hotel)) {
			hoteis.remove(hotel);
		} else {
			throw new HotelNaoEncontradoException(String.format("O hotel %s não foi encontrado.", hotel.getNome()));
		}*/
		boolean removido = hoteis.remove(hotel);
		
		if (!removido) {
			throw new HotelNaoEncontradoException(String.format("O hotel %s não foi encontrado.", hotel.getNome()));
		}
	}
	
	
	public void removerTodos() {
		hoteis.clear();
	}
	
}
