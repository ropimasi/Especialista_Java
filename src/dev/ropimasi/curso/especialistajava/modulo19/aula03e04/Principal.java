package dev.ropimasi.curso.especialistajava.modulo19.aula03e04;

public class Principal {

	public static void main(String[] args) {
		
		// Imprime o valor do enum (constante) especificado.
		System.out.println(StatusPedido.EMITIDO);
		
		// Retorna uma String com o nome do enum especificado.
		System.out.println(StatusPedido.EMITIDO.name());		
		
		// Retorna o índice do enum especificado.
		System.out.println(StatusPedido.EMITIDO.ordinal());
		
		// Retorna uma String com o nome do enum especificado. toString() é sobrescrevível.
		System.out.println(StatusPedido.EMITIDO.toString());
		
		// Iterar sobre os valores (constantes) do enum.
		 for (StatusPedido status : StatusPedido.values()) {
			 System.out.printf("%d - %s%n", status.ordinal(), status.name());
		 }
		
		String textoStatus = "CANCELADO"; // Uma string lida de alguma fonte do sistema (api, arquivo, formulario, etc).
//		String textoStatus = "TESTE"; // Uma string que não exista no enum lancará IllegalArgumentException. 
		StatusPedido status = StatusPedido.valueOf(textoStatus);
		System.out.println(status.ordinal() + " - " + status.name());
		
		int numero = 1; // Um número lido de alguma fonte do sistema (api, arquivo, formulario, etc).
//		int numero = 10; // Um número de index que não exista no index do enum lancará ArrayIndexOutOfBoundsException. 
		StatusPedido status2 = StatusPedido.values()[numero];
		System.out.println(status2.ordinal() + " - " + status2.name());
		
	}

}
