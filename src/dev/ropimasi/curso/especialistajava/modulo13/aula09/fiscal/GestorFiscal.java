package dev.ropimasi.curso.especialistajava.modulo13.aula09.fiscal;

public class GestorFiscal {
	
	public void emitirNotasFiscais(NotaFiscal...notasFiscais) {
		for (NotaFiscal nf : notasFiscais) {
			nf.emitir();
			System.out.println("--------");
		}
	}
	
}
