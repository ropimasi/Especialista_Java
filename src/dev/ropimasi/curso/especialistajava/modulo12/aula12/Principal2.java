package dev.ropimasi.curso.especialistajava.modulo12.aula12;

import dev.ropimasi.curso.especialistajava.modulo12.aula12.banco.ContaInvestimento;
import dev.ropimasi.curso.especialistajava.modulo12.aula12.banco.Titular;




public class Principal2 {

	public static void main(String[] args) {
		Titular titular = new Titular("joão da Silva", "12345678900");
		ContaInvestimento conta2 = new ContaInvestimento(titular, 1234, 999999);

		conta2.imprimirDemonstrativo();

		conta2.depositar(200);

		conta2.imprimirDemonstrativo();

		conta2.sacar(90);

		conta2.imprimirDemonstrativo();

		conta2.creditarRendimentos(2); // pode gerar valores quebrados com 3ª casa decimal

		conta2.imprimirDemonstrativo();

	}

}
