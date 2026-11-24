package dev.ropimasi.curso.especialistajava.modulo25.aula02;

import dev.ropimasi.curso.especialistajava.modulo25.aula02.crm.CadastroCliente;
import dev.ropimasi.curso.especialistajava.modulo25.aula02.crm.Cliente;
import dev.ropimasi.curso.especialistajava.modulo25.aula02.crm.Filtro;
import dev.ropimasi.curso.especialistajava.modulo25.aula02.crm.FiltroCliente;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

        Filtro<Cliente> filtro1 = new Filtro<Cliente>() {
            @Override
            public boolean avaliarIdade(Cliente objetoCliente) {
                return objetoCliente.getIdade() > 40;
            }

			@Override
			public boolean avaliarNomeContem(Cliente objetoCliente, String nomeParte) {
				return objetoCliente.getNome().contains(nomeParte);
			}
        };
        
//		  Expressão lambda - para implementar TEM QUE SER functional interface.
//        Filtro<Cliente> filtro = (Cliente cliente) -> {
//        	boolean resultado = cliente.getIdade() > 40;
//        	return resultado;
//        };

//		  Expressão lambda correta - SAM - functional interface.
//        FiltroCliente<Cliente> filtroIdade = (Cliente cliente) -> {
//        	boolean resultado = cliente.getIdade() > 40;
//        	return resultado;
//        };
        
        
        List<Cliente> clientes1 = cadastroCliente.consultarIdadeMaior40(filtro1);
        for (Cliente cliente : clientes1) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
        
        System.out.println("----");
        
//        List<Cliente> clientes2 = cadastroCliente.consultar(filtroIdade);
        List<Cliente> clientes2 = cadastroCliente.consultar(
        		(Cliente cliente) -> {
                	boolean resultado = cliente.getIdade() > 40;
                	return resultado;
                });
        for (Cliente cliente : clientes2) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
        
        System.out.println("----");
        
        List<Cliente> clientes3 = cadastroCliente.consultarNomeContem(filtro1, "J");
        for (Cliente cliente : clientes3) {
        	System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }

}