package dev.ropimasi.curso.especialistajava.modulo14.aula09_.financeira;

import dev.ropimasi.curso.especialistajava.modulo14.aula09_.financeira.modelo.Funcionario;
import dev.ropimasi.curso.especialistajava.modulo14.aula09_.financeira.modelo.PessoaBonificavel;
import dev.ropimasi.curso.especialistajava.modulo14.aula09_.financeira.servico.ServicoPagamentoBonus;




public class Principal2 {

	public static void main(String[] args) {

		// Não compila.
		//		ClienteFinanciavel funcionario = new Funcionario("Jão da Silva", 15_000);
		//		funcionario.calcularBonus(80);

		// Não compila.		
		//		Fazenda fazenda = new Fazenda("Faz D. Benedita", 500_000, 5);
		//		fazenda.calcularBonus(80);

		// Sim compila.
		PessoaBonificavel funcionario1 = new Funcionario("Jão da Silva", 15_000);
		funcionario1.calcularBonus(80);

		// Sim compila.		
		Funcionario funcionario2 = new Funcionario("Jão dos Santos", 14_000);
		funcionario2.calcularBonus(75);

		ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
		servicoPagamentoBonus.pagar(funcionario1, 80);
		servicoPagamentoBonus.pagar(funcionario2, 75);

	}

}