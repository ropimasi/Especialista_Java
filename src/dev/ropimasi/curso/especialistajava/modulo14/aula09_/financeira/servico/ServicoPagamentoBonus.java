package dev.ropimasi.curso.especialistajava.modulo14.aula09_.financeira.servico;

import dev.ropimasi.curso.especialistajava.modulo14.aula09_.financeira.modelo.PessoaBonificavel;




public class ServicoPagamentoBonus {

	public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
		double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

		// Aqui teria a implementação da lógica de pagamento.

		System.out.printf("Pagamento de bônus no valor de R$%.2f%n", valorBonus);
	}
}
