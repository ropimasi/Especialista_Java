package dev.ropimasi.curso.especialistajava.modulo13.aula08;

import dev.ropimasi.curso.especialistajava.modulo13.aula08.fiscal.GestorFiscal;
import dev.ropimasi.curso.especialistajava.modulo13.aula08.fiscal.NotaFiscal;
import dev.ropimasi.curso.especialistajava.modulo13.aula08.fiscal.NotaFiscalProduto;
import dev.ropimasi.curso.especialistajava.modulo13.aula08.fiscal.NotaFiscalServico;




public class Principal {

	public static void main(String[] args) {

		var gestorFiscal = new GestorFiscal();
		/*
		 * A variável nf do tipo NotaFiscal pode referenciar qualquer objeto da hierarquia
		 * de classes que estendem NotaFiscal, ou seja, NotaFiscalProduto e NotaFiscalServico.
		 * No entando ela está referenciando um objeto da própria classe NotaFiscal,
		 * que é uma classe muito abstrata, pois não é nem de produto, nem de serviço.
		 * Este tipo de situação é indesejável, e para evitar isso, a classe NotaFiscal
		 * deveria ser abstrata, ou seja, não poderia ser instanciada diretamente. 
		 * */
		var nf = new NotaFiscal("Abstrato", 2000); // indesejável que seja instanciável.
		var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
		var nfReparoAutomovel = new NotaFiscalServico("Reparo da roda", 900, true);

		gestorFiscal.emitirNotasFiscais(nf, nfBolaFutebol, nfReparoAutomovel);
		
		
		
		//		System.out.println(nfBolaFutebol.calcularImpostos());
		//		System.out.println(nfReparoAutomovel.calcularImpostos());

	}

}
