package dev.ropimasi.curso.especialistajava.modulo13.aula03;

import dev.ropimasi.curso.especialistajava.modulo13.aula03.banco.ContaInvestimento;
import dev.ropimasi.curso.especialistajava.modulo13.aula03.banco.Conta;
import dev.ropimasi.curso.especialistajava.modulo13.aula03.banco.ContaEspecial;
import dev.ropimasi.curso.especialistajava.modulo13.aula03.banco.Titular;




public class Principal3 {

	public static void main(String[] args) {

		Titular titular = new Titular("joão da Silva", "12345678900");
		ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 12.00);
		contaEspecial.setLimiteChequeEspecial(1000);
		contaEspecial.imprimirDemonstrativo();
		contaEspecial.depositar(200);
		contaEspecial.imprimirDemonstrativo();
		contaEspecial.sacar(50);
		contaEspecial.imprimirDemonstrativo();
		contaEspecial.creditarRendimentos(2); // pode gerar valores quebrados com 3ª casa decimal
		contaEspecial.imprimirDemonstrativo();
		contaEspecial.sacar(300);
		contaEspecial.imprimirDemonstrativo();
		contaEspecial.debitarTarifaMensal();
		contaEspecial.imprimirDemonstrativo();
		System.out.println(contaEspecial);

		// UPCASTING
		Conta conta = (Conta) contaEspecial; // ou Conta conta = contaEspecial;
		System.out.println("---- UPCASTING ----");
		System.out.println(conta);
		System.out.println(conta.getClass().getName());
		System.out.println("-");
		System.out.println(contaEspecial);
		System.out.println(contaEspecial.getClass().getName());
		System.out.println("-");
		System.out.println(conta == contaEspecial); // true
		
		ContaInvestimento contaInvestimento1 = (ContaInvestimento) contaEspecial; // Upcasting explícito.
		ContaInvestimento contaInvestimento2 = contaEspecial; // Upcasting implícito.
		
		
		
	}

}
