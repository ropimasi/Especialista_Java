package dev.ropimasi.curso.especialistajava.modulo12.aula17;

import dev.ropimasi.curso.especialistajava.modulo12.aula17.banco.Conta;
import dev.ropimasi.curso.especialistajava.modulo12.aula17.banco.ContaEspecial;
import dev.ropimasi.curso.especialistajava.modulo12.aula17.banco.ContaInvestimento;
import dev.ropimasi.curso.especialistajava.modulo12.aula17.banco.Titular;




public class Principal {

	public static void main(String[] args) {

		Titular titular = new Titular("joão da Silva", "12345678900");
		Conta conta1a = new Conta(titular, 1234, 999999);
		Conta conta1b = new Conta(titular, 1234, 999999);
		Conta conta1c = new Conta(titular, 1234, 999999);
		
		Conta conta2 = new ContaInvestimento(titular, 1234, 999999);
		Conta conta3 = new ContaEspecial(titular, 1234, 999999, 50);

		conta1a.imprimirDemonstrativo();
		conta1a.depositar(200);
		conta1a.imprimirDemonstrativo();

		conta2.imprimirDemonstrativo();
		conta2.depositar(500);
		conta2.imprimirDemonstrativo();

		conta3.imprimirDemonstrativo();
		conta3.depositar(1000);
		conta3.imprimirDemonstrativo();

		System.out.println("- reflexiva ---------------");
		System.out.println(conta1a.equals(conta1a)); // reflexiva
		System.out.println("- simétrica ---------------");
		System.out.println(conta1a.equals(conta1b)); // simétrica
		System.out.println(conta1b.equals(conta1a)); // simétrica
		System.out.println("- transitiva ---------------");
		System.out.println(conta1a.equals(conta1b)); // transitiva
		System.out.println(conta1b.equals(conta1c)); // transitiva
		System.out.println(conta1c.equals(conta1a)); // transitiva
		System.out.println("- consistente ---------------");
		System.out.println(conta1b.equals(conta1c)); // consistente
		System.out.println(conta1b.equals(conta1c)); // consistente
		System.out.println(conta1b.equals(conta1c)); // consistente
		conta2.depositar(500);
		System.out.println(conta1b.equals(conta1c)); // consistente
		System.out.println(conta1b.equals(conta1c)); // consistente
		System.out.println(conta1b.equals(conta1c)); // consistente
		conta2.sacar(150);
		System.out.println(conta1b.equals(conta1c)); // consistente
		System.out.println(conta1b.equals(conta1c)); // consistente
		System.out.println(conta1b.equals(conta1c)); // consistente
		conta2.sacar(70);
		System.out.println(conta1b.equals(conta1c)); // consistente
		System.out.println(conta1b.equals(conta1c)); // consistente
		System.out.println(conta1b.equals(conta1c)); // consistente
		System.out.println("- null-false ---------------");
		System.out.println(conta1a.equals(null)); // null-false
		System.out.println(conta2.equals(null)); // null-false
		System.out.println(conta3.equals(null)); // null-false
	}

}
