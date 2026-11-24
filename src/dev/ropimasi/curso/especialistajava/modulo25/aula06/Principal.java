package dev.ropimasi.curso.especialistajava.modulo25.aula06;

import java.util.List;
import dev.ropimasi.curso.especialistajava.modulo25.aula06.crm.CadastroCliente;
import dev.ropimasi.curso.especialistajava.modulo25.aula06.crm.Cliente;



public class Principal {

	public static void main(String[] args) {
		var cadastroCliente = new CadastroCliente();
		cadastroCliente.adicionar(new Cliente("João", 30));
		cadastroCliente.adicionar(new Cliente("Maria", 90));
		cadastroCliente.adicionar(new Cliente("Sebastião", 50));
		cadastroCliente.adicionar(new Cliente("Joaquina", 45));
		cadastroCliente.adicionar(new Cliente("Josefina", 25));

		List<Cliente> clientes1 = cadastroCliente.consultar((Cliente cliente) -> {
			boolean resultado = cliente.getIdade() > 40;
			return resultado;
		});

		
		List<Cliente> clientes2 = cadastroCliente.consultar(c -> c.getIdade() > 40);
		
		
		for (Cliente cliente : clientes2) {
			System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
		}

	}

}