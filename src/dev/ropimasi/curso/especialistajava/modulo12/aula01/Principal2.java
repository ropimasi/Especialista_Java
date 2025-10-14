package dev.ropimasi.curso.especialistajava.modulo12.aula01;

import dev.ropimasi.curso.especialistajava.modulo12.aula01.banco.Conta;
import dev.ropimasi.curso.especialistajava.modulo12.aula01.banco.Titular;




public class Principal2 {

	public static void main(String[] args) {
		Conta conta2 = new Conta();
		conta2.setTitular(new Titular("joão da Silva", "12345678900"));
		conta2.setAgencia(1234);
		conta2.setNumero(999999);
		conta2.setTipo(Conta.INVESTIMENTO);
//		conta2.setLimiteChequeEspecial(1000); // exception.

		conta2.imprimirDemonstrativo();
		
		conta2.depositar(200);
		
		conta2.imprimirDemonstrativo();
		
		conta2.sacar(89.50);

		conta2.imprimirDemonstrativo();
		
		conta2.creditarRendimentos(3);
		
		conta2.imprimirDemonstrativo();
		
	}

}
