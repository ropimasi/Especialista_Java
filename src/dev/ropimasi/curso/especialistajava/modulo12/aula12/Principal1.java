package dev.ropimasi.curso.especialistajava.modulo12.aula12;

import dev.ropimasi.curso.especialistajava.modulo12.aula12.banco.Conta;
import dev.ropimasi.curso.especialistajava.modulo12.aula12.banco.Titular;




public class Principal1 {

	public static void main(String[] args) {
		
		Titular titular = new Titular("joão da Silva", "12345678900");
		Conta conta1 = new Conta(titular, 1234, 999999);

		conta1.imprimirDemonstrativo();

		conta1.depositar(200);

		conta1.imprimirDemonstrativo();

		conta1.sacar(89.50);

		conta1.imprimirDemonstrativo();

		System.out.println(conta1);
	}

}
