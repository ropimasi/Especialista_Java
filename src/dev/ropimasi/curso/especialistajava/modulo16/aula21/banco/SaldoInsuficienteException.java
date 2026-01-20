package dev.ropimasi.curso.especialistajava.modulo16.aula21.banco;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String message, Throwable cause) {
		super(message, cause);
	}

}
