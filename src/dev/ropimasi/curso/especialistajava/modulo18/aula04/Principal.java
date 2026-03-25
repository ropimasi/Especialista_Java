package dev.ropimasi.curso.especialistajava.modulo18.aula04;

import dev.ropimasi.curso.especialistajava.modulo18.aula04.agencia.CadastroHotel;
import dev.ropimasi.curso.especialistajava.modulo18.aula04.agencia.Hotel;




public class Principal {

	public static void main(String[] args) {
		CadastroHotel cadastro = new CadastroHotel();
		cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
		cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
		cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
		cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
		cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

		//        System.out.println(cadastro.obterTodos());

		Hotel hotel = (Hotel) cadastro.obterTodos().get(1);
		System.out.println(hotel.getNome());
	}

}
