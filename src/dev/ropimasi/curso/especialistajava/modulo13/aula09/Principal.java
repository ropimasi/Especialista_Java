package dev.ropimasi.curso.especialistajava.modulo13.aula09;

import dev.ropimasi.curso.especialistajava.modulo13.aula09.fiscal.GestorFiscal;
import dev.ropimasi.curso.especialistajava.modulo13.aula09.fiscal.NotaFiscal;
import dev.ropimasi.curso.especialistajava.modulo13.aula09.fiscal.NotaFiscalProduto;
import dev.ropimasi.curso.especialistajava.modulo13.aula09.fiscal.NotaFiscalServico;




public class Principal {

	public static void main(String[] args) {

		var gestorFiscal = new GestorFiscal();
		
		var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
		var nfReparoAutomovel = new NotaFiscalServico("Reparo da roda", 900, true);

		gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoAutomovel);
		
		
		
		//		System.out.println(nfBolaFutebol.calcularImpostos());
		//		System.out.println(nfReparoAutomovel.calcularImpostos());

	}

}
