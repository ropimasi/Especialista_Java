package dev.ropimasi.curso.especialistajava.modulo18.aula19;

import java.util.List;
import dev.ropimasi.curso.especialistajava.modulo18.aula19.agencia.CadastroHotel;
import dev.ropimasi.curso.especialistajava.modulo18.aula19.agencia.Hotel;
import dev.ropimasi.curso.especialistajava.modulo18.aula19.agencia.PrecoHotelComparator;



public class Principal {

	public static void main(String[] args) {
		CadastroHotel cadastro = new CadastroHotel();
		cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
		cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);
		cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 1300);
		cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
		cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//		cadastro.ordenar();
		cadastro.ordenarPorPreco();
//		cadastro.ordenarPorPrecoInverso();

		List<Hotel> hoteis = cadastro.obterTodos();
		imprimirHoteis(hoteis);
		
		System.out.println();
		PrecoHotelComparator comparadorPrecoHotel = new PrecoHotelComparator();
		System.out.println("Qual é maior? " + comparadorPrecoHotel.compare(cadastro.obterTodosComoArray()[0], cadastro.obterTodosComoArray()[4]));
	}


	private static void imprimirHoteis(List<Hotel> hoteis) {
		for (Hotel hotel : hoteis) {
			System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
		}
	}

}
