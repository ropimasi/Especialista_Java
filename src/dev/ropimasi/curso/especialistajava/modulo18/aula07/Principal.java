package dev.ropimasi.curso.especialistajava.modulo18.aula07;

import java.util.ArrayList;
import dev.ropimasi.curso.especialistajava.modulo18.aula07.agencia.CadastroHotel;
import dev.ropimasi.curso.especialistajava.modulo18.aula07.agencia.Hotel;




public class Principal {

	public static void main(String[] args) {
		CadastroHotel cadastro = new CadastroHotel();
		cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
		cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
		cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
		cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
		cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//		cadastro.adicionar("Vila Selvagem", "Fortaleza/CE", 1400);
		
		ArrayList<Hotel> hoteis = cadastro.obterTodos();
		int indice = hoteis.indexOf(new Hotel("Vila Selvagem", "Fortim/CE", 1400));
		System.out.println();
		System.out.println("Índice do hotel Vila Selvagem: " + indice);
		System.out.println();
		System.out.println(hoteis.get(indice));
		System.out.println();
		int indice2 = hoteis.lastIndexOf(new Hotel("Tivoli Ecoresort", "Praia do Forte/BA", 2000));
		System.out.println("Índice do hotel Tivoli Ecoresort: " + indice2);
		System.out.println();
		System.out.println(hoteis.get(indice));
		System.out.println();
		imprimirHoteis(hoteis);
	}
	

	private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
		for (int i = 0; i < hoteis.size(); i++) {
			Hotel hotel = (Hotel)hoteis.get(i);
			System.out.printf("%s (%s) -> %.2f%n",
					hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
		}
	}

}
