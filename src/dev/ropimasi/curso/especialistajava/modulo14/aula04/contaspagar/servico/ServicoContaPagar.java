package dev.ropimasi.curso.especialistajava.modulo14.aula04.contaspagar.servico;

import dev.ropimasi.curso.especialistajava.modulo14.aula04.pagamento.DocumentoPagavel;
import dev.ropimasi.curso.especialistajava.modulo14.aula04.pagamento.MetodoPagamento;




public class ServicoContaPagar {

	private MetodoPagamento metodoPagamento;



	public ServicoContaPagar(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}



	public void pagar(DocumentoPagavel documento) {

		// Aqui poderia ter outras regras de negócio,
		// como por exemplo registrar o pagamento do banco de dados,
		// enviar e-mail, notificação, etc.

		metodoPagamento.pagar(documento);

	}

}
