package dev.ropimasi.curso.especialistajava.modulo12.aula01;

import dev.ropimasi.curso.especialistajava.modulo12.aula01.banco.ContaEspecial;
import dev.ropimasi.curso.especialistajava.modulo12.aula01.banco.Titular;




public class Principal3 {

	public static void main(String[] args) {
		ContaEspecial conta3 = new ContaEspecial();
		conta3.setTitular(new Titular("joão da Silva", "12345678900"));
		conta3.setAgencia(1234);
		conta3.setNumero(999999);
		conta3.setLimiteChequeEspecial(1000);
		conta3.setTarifaMensal(12.50);

		conta3.imprimirDemonstrativo();

		conta3.depositar(200);

		conta3.imprimirDemonstrativo();

		conta3.sacar(89.50);

		conta3.imprimirDemonstrativo();

		conta3.creditarRendimentos(3); // gera valores quebrados com 3ª casa decimal

		conta3.imprimirDemonstrativo();

		conta3.sacar(300.815);

		conta3.imprimirDemonstrativo();

		conta3.debitarTarifaMensal();

		conta3.imprimirDemonstrativo();

	}

}
