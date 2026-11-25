package dev.ropimasi.curso.especialistajava.modulo25.aula07;

import java.util.Comparator;
import java.util.List;
import dev.ropimasi.curso.especialistajava.modulo25.aula07.crm.CadastroCliente;
import dev.ropimasi.curso.especialistajava.modulo25.aula07.crm.Cliente;



public class Principal {

	public static void main(String[] args) {
		var cadastroCliente = new CadastroCliente();
		cadastroCliente.adicionar(new Cliente("João", 30));
		cadastroCliente.adicionar(new Cliente("Maria", 90));
		cadastroCliente.adicionar(new Cliente("Sebastião", 50));
		cadastroCliente.adicionar(new Cliente("Joaquina", 45));
		cadastroCliente.adicionar(new Cliente("Josefina", 25));

		List<Cliente> clientes1 = cadastroCliente.getClientes();
//		Forma de criar um Comparator para o .sort() com classe anônima.
//		clientes1.sort(new Comparator<Cliente>() {
//			@Override
//			public int compare(Cliente o1, Cliente o2) {
//				return Integer.compare(o1.getIdade(), o2.getIdade());
//			}
//		});

//		Forma de criar um Comparator para o .sort() com Lambda Expression.
		clientes1.sort((o1, o2) -> Integer.compare(o1.getIdade(), o2.getIdade()));
		
		
		// Listar na tela.
		for (Cliente cliente : clientes1) {
			System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
		}

	}

}