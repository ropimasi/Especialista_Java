package dev.ropimasi.curso.especialistajava.modulo12.aula16;

import dev.ropimasi.curso.especialistajava.modulo12.aula16.banco.ContaEspecial;
import dev.ropimasi.curso.especialistajava.modulo12.aula16.banco.Titular;




public class Principal3 {

	public static void main(String[] args) {

		Titular titular = new Titular("joão da Silva", "12345678900");
		ContaEspecial conta3 = new ContaEspecial(titular, 1234, 999999, 12.00);
		conta3.setLimiteChequeEspecial(1000);

		conta3.imprimirDemonstrativo();

		conta3.depositar(200);

		conta3.imprimirDemonstrativo();

		conta3.sacar(50);

		conta3.imprimirDemonstrativo();

		conta3.creditarRendimentos(2); // pode gerar valores quebrados com 3ª casa decimal

		conta3.imprimirDemonstrativo();

		conta3.sacar(300);

		conta3.imprimirDemonstrativo();

		conta3.debitarTarifaMensal();

		conta3.imprimirDemonstrativo();

		System.out.println(conta3);
	}

}
