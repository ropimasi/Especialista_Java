package dev.ropimasi.curso.especialistajava.modulo14.aula02;

import dev.ropimasi.curso.especialistajava.modulo14.aula02.contaspagar.modelo.Holerite;
import dev.ropimasi.curso.especialistajava.modulo14.aula02.contaspagar.modelo.OrdemServico;
import dev.ropimasi.curso.especialistajava.modulo14.aula02.contaspagar.servico.ServicoContaPagar;
import dev.ropimasi.curso.especialistajava.modulo14.aula02.pagamento.Beneficiario;




public class Principal {

	public static void main(String[] args) {

		ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

		Beneficiario funcionario1 = new Beneficiario("Jão da Silva", "12345678900", "123456-0");
		Beneficiario fornecedor1 = new Beneficiario("Consultoria Habi", "12345678000199", "82321-0");

		Holerite holerite1 = new Holerite(funcionario1, 150.00, 160);
		OrdemServico os1 = new OrdemServico(fornecedor1, 50_000);

		// Graças ao polimorfismo, aqui é um casting implícito de Holerite para DocumentoPagavel.
		// servicoContaPagar.pagar((DocumentoPagavel) documento1);
		servicoContaPagar.pagar(holerite1);
		servicoContaPagar.pagar(os1);
	}

}
