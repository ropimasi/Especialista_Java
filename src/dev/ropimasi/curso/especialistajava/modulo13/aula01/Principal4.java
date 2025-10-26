package dev.ropimasi.curso.especialistajava.modulo13.aula01;

import dev.ropimasi.curso.especialistajava.modulo13.aula01.banco.ContaEspecial;
import dev.ropimasi.curso.especialistajava.modulo13.aula01.banco.ContaInvestimento;
import dev.ropimasi.curso.especialistajava.modulo13.aula01.banco.ContaSalario;
import dev.ropimasi.curso.especialistajava.modulo13.aula01.banco.Titular;




public class Principal4 {

	public static void main(String[] args) {

		Titular titular = new Titular("joão da Silva", "12345678900");

		// upcasting
		ContaInvestimento contaInvestimento1 = new ContaEspecial(titular, 1234, 999999, 50);

		// Falha! Pois não tem hierarquia: ContaSalario é subtipo de Conta, mas não de ContaInvestimento.
		ContaInvestimento contaInvestimento2 = new ContaSalario(titular, 1234, 999999, 6000);

	}

}
