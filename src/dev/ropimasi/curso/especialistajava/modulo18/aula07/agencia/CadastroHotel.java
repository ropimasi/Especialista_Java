package dev.ropimasi.curso.especialistajava.modulo18.aula07.agencia;

import java.util.ArrayList;



public class CadastroHotel {

	private final ArrayList<Hotel> hoteis = new ArrayList<>();


	public void adicionar(String nome, String cidade, double precoDiaria) {
		Hotel hotel = new Hotel(nome, cidade, precoDiaria);

		if (hoteis.contains(hotel)) {
			throw new HotelJaExistenteException(String.format("O hotel %s já existe.", hotel.getNome()));
		}

		hoteis.add(hotel);
	}


	public ArrayList<Hotel> obterTodos() {
		return hoteis;
	}

}
