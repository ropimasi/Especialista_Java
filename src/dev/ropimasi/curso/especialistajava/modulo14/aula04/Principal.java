package dev.ropimasi.curso.especialistajava.modulo14.aula04;

import dev.ropimasi.curso.especialistajava.modulo14.aula04.contaspagar.modelo.Holerite;
import dev.ropimasi.curso.especialistajava.modulo14.aula04.contaspagar.modelo.OrdemServico;
import dev.ropimasi.curso.especialistajava.modulo14.aula04.contaspagar.servico.ServicoContaPagar;
import dev.ropimasi.curso.especialistajava.modulo14.aula04.pagamento.Beneficiario;
import dev.ropimasi.curso.especialistajava.modulo14.aula04.pagamento.MetodoPagamento;
import dev.ropimasi.curso.especialistajava.modulo14.aula04.pagamento.Pix;
import dev.ropimasi.curso.especialistajava.modulo14.aula04.pagamento.Transferencia;




public class Principal {

	public static void main(String[] args) {

		Beneficiario funcionario1 = new Beneficiario("Jão da Silva", "12345678900", "123456-0");
		Beneficiario fornecedor1 = new Beneficiario("Consultoria Habi", "12345678000199", "82321-0");

		Holerite holerite1 = new Holerite(funcionario1, 150.00, 160);
		OrdemServico os1 = new OrdemServico(fornecedor1, 50_000);

		// Graças ao polimorfismo, aqui é um casting implícito de Holerite para DocumentoPagavel.
		// servicoContaPagar.pagar((DocumentoPagavel) documento1);

		MetodoPagamento metodoPagamento1 = new Pix();
		MetodoPagamento metodoPagamento2 = new Transferencia();

		ServicoContaPagar servicoContaPagar1 = new ServicoContaPagar(metodoPagamento1);
		servicoContaPagar1.pagar(holerite1);
		servicoContaPagar1.pagar(os1);

		ServicoContaPagar servicoContaPagar2 = new ServicoContaPagar(metodoPagamento2);
		servicoContaPagar2.pagar(holerite1);
		servicoContaPagar2.pagar(os1);
	}

}
