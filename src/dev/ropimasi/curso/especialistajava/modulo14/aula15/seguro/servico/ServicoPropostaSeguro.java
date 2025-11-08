package dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.servico;

import dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.modelo.BemSeguravel;

public class ServicoPropostaSeguro {
	
	public void emitir(BemSeguravel bem) {
		System.out.println("-------- Proposta de Seguro --------");
		System.out.println(bem.descrever());
		System.out.printf("Prêmio: R$%.2f%n", bem.calcularValorPremio());
		System.out.println("------------------------------------");		
	}
	
}
