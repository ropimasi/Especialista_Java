package dev.ropimasi.curso.especialistajava.modulo25.aula07.crm;

@FunctionalInterface
public interface FiltroCliente<T> {
	boolean avaliar(T objetoCliente);
}
