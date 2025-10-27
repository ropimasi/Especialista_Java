package dev.ropimasi.curso.especialistajava.modulo13.aula08.fiscal;

public class GestorFiscal {
	
	public void emitirNotasFiscais(NotaFiscal...notasFiscais) {
		for (NotaFiscal nf : notasFiscais) {
			nf.emitir();
			System.out.println("--------");
		}
	}
	
}
