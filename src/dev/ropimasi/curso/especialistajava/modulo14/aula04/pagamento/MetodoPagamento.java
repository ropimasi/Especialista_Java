package dev.ropimasi.curso.especialistajava.modulo14.aula04.pagamento;


/* O nome desta classe "MetodoPagamento" significa o tipo-de-pagamento
 * a ser realizado: din, cartao, pix, transferência, etc. */
public interface MetodoPagamento {

	void pagar(DocumentoPagavel documento);
}
