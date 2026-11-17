package dev.ropimasi.curso.especialistajava.modulo24.aula04;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("João", 41);
		
		System.out.println(cliente);
		
		cliente.setStatus(Cliente.Status.BLOQUEADO);
		
		System.out.println(cliente);
	}

}