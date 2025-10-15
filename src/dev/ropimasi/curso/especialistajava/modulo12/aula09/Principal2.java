package dev.ropimasi.curso.especialistajava.modulo12.aula09;

import dev.ropimasi.curso.especialistajava.modulo12.aula09.banco.ContaInvestimento;
import dev.ropimasi.curso.especialistajava.modulo12.aula09.banco.Titular;




public class Principal2 {

	public static void main(String[] args) {
		ContaInvestimento conta2 = new ContaInvestimento();
		conta2.setTitular(new Titular("joão da Silva", "12345678900"));
		conta2.setAgencia(1234);
		conta2.setNumero(999999);

		conta2.imprimirDemonstrativo();

		conta2.depositar(200);

		conta2.imprimirDemonstrativo();

		conta2.sacar(90);

		conta2.imprimirDemonstrativo();

		conta2.creditarRendimentos(2); // pode gerar valores quebrados com 3ª casa decimal

		conta2.imprimirDemonstrativo();

	}

}
