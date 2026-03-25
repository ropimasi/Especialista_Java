package dev.ropimasi.curso.especialistajava.modulo18.aula06;

import java.util.ArrayList;
import dev.ropimasi.curso.especialistajava.modulo18.aula06.agencia.CadastroHotel;
import dev.ropimasi.curso.especialistajava.modulo18.aula06.agencia.Hotel;




public class Principal {

	public static void main(String[] args) {
		CadastroHotel cadastro = new CadastroHotel();
		cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
		cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
		cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
		cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
		cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

		ArrayList<Hotel> hoteis = cadastro.obterTodos();
		imprimirHoteis(hoteis);
	}
	

	private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
		for (int i = 0; i < hoteis.size(); i++) {
			Hotel hotel = (Hotel)hoteis.get(i);
			System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
		}
	}

}
