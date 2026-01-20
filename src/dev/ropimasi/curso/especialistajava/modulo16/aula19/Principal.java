package dev.ropimasi.curso.especialistajava.modulo16.aula19;

import dev.ropimasi.curso.especialistajava.modulo16.aula19.crm.Cliente;
import dev.ropimasi.curso.especialistajava.modulo16.aula19.crm.ServicoCadastroCliente;

public class Principal {
	public static void main(String[] args) {

		ServicoCadastroCliente servico = new ServicoCadastroCliente();
		Cliente clienteCadastrado = servico.cadastrar("Jão", 17);
		
		System.out.println("Cliente cadastrado: " + clienteCadastrado.getNome());
	}
}
