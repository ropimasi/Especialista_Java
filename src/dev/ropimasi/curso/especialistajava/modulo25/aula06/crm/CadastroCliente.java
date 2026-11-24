package dev.ropimasi.curso.especialistajava.modulo25.aula06.crm;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {

    private final List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> consultarIdadeMaior40(Filtro<Cliente> filtro) {
    	List<Cliente> clientesFiltrados = new ArrayList<>();
    	
    	for (Cliente cliente : clientes) {
    		if (filtro.avaliarIdade(cliente)) {
    			clientesFiltrados.add(cliente);
    		}
    	}
    	
    	return clientesFiltrados;
    }
 
    public List<Cliente> consultarNomeContem(Filtro<Cliente> filtro, String nomeParte) {
        List<Cliente> clientesFiltrados = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (filtro.avaliarNomeContem(cliente, nomeParte)) {
                clientesFiltrados.add(cliente);
            }
        }

        return clientesFiltrados;
    }
    
    public List<Cliente> consultar(FiltroCliente<Cliente> filtro) {
    	List<Cliente> clientesFiltrados = new ArrayList<>();
    	
    	for (Cliente cliente : clientes) {
    		if (filtro.avaliar(cliente)) {
    			clientesFiltrados.add(cliente);
    		}
    	}
    	
    	return clientesFiltrados;
    }

}