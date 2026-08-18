package dev.ropimasi.curso.especialistajava.modulo18.aula09;

import java.util.ArrayList;
import java.util.Iterator;
import dev.ropimasi.curso.especialistajava.modulo18.aula09.agencia.CadastroHotel;
import dev.ropimasi.curso.especialistajava.modulo18.aula09.agencia.Hotel;



public class Principal {

	public static void main(String[] args) {
		CadastroHotel cadastro = new CadastroHotel();
		cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
		cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
		cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
		cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
		cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

		ArrayList<Hotel> hoteis = cadastro.obterTodos();
		//hoteis.set(0, new Hotel("Jaguaribe Lodge", "Fortim/CE", 1500));
		hoteis.add(3, new Hotel("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200));
		imprimirHoteis(hoteis);

		System.out.println();
		cadastro.removerPorCidade("Fortim/CE");
		imprimirHoteis(hoteis);

		System.out.println();
		cadastro.remove(new Hotel("Mercure", "Uberlândia/MG", 400));
		imprimirHoteis(hoteis);
	}


	private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
		Iterator<Hotel> hotelIterator = hoteis.iterator();

		while (hotelIterator.hasNext()) {
			Hotel hotel = hotelIterator.next();
			System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
			
//			hoteis.remove(0);
		}
	}

}
