package dev.ropimasi.curso.especialistajava.modulo16.aula15.estoque;

public class ProdutoException extends Exception {

	public ProdutoException() {
		super();
	}



	public ProdutoException(String message) {
		super(message);
	}



	public ProdutoException(Throwable cause) {
		super(cause);
	}



	public ProdutoException(String message, Throwable cause) {
		super(message, cause);
	}



	public ProdutoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}