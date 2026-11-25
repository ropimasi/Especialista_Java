package dev.ropimasi.curso.especialistajava.modulo25.aula08.crm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CadastroCliente {

    private final List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> consultarIdadeMaior40(Predicate<Cliente> filtro) {
    	List<Cliente> clientesFiltrados = new ArrayList<>();
    	
    	for (Cliente cliente : clientes) {
    		if (filtro.test(cliente)) {
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