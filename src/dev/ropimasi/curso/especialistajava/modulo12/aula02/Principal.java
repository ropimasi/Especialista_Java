package dev.ropimasi.curso.especialistajava.modulo12.aula02;

import dev.ropimasi.curso.especialistajava.modulo12.aula02.banco.Conta;
import dev.ropimasi.curso.especialistajava.modulo12.aula02.banco.Titular;




public class Principal {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setTitular(new Titular("joão da Silva", "12345678900"));
		conta1.setAgencia(1234);
		conta1.setNumero(999999);
		conta1.setTipo(Conta.ESPECIAL);
		conta1.setTarifaMensal(65.30);
		conta1.setLimiteChequeEspecial(2000);

		conta1.imprimirDemonstrativo();

		conta1.depositar(200);

		conta1.imprimirDemonstrativo();

		conta1.sacar(85.50);

		conta1.imprimirDemonstrativo();

		conta1.creditarRendimentos(3);

		conta1.imprimirDemonstrativo();

		conta1.debitarTarifaMensal();

		conta1.imprimirDemonstrativo();
		
		conta1.sacar(500);
		
		conta1.imprimirDemonstrativo();		

	}

}
