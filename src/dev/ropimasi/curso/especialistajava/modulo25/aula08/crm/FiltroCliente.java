package dev.ropimasi.curso.especialistajava.modulo25.aula08.crm;

@FunctionalInterface
public interface FiltroCliente<T> {
	boolean avaliar(T objetoCliente);
}
