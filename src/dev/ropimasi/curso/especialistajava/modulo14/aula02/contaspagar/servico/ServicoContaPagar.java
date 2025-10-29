package dev.ropimasi.curso.especialistajava.modulo14.aula02.contaspagar.servico;

import dev.ropimasi.curso.especialistajava.modulo14.aula02.pagamento.Beneficiario;
import dev.ropimasi.curso.especialistajava.modulo14.aula02.pagamento.DocumentoPagavel;




public class ServicoContaPagar {

	public void pagar(DocumentoPagavel documento) {
		Beneficiario beneficiario = documento.getBeneficiario();

		if (beneficiario.naoPossuiChavePix()) {
			throw new RuntimeException("Beneficiário não possui chave Pix.");
		}

		System.out.printf("DEBUG: Efetuando PIX para %s no valor de %.2f com a chave %s%n", beneficiario.getNome(),
				documento.getValorTotal(), beneficiario.getChavePix());
	}

}
