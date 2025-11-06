package dev.ropimasi.curso.especialistajava.modulo14.aula05.financeira;

import dev.ropimasi.curso.especialistajava.modulo14.aula05.financeira.modelo.Fazenda;
import dev.ropimasi.curso.especialistajava.modulo14.aula05.financeira.modelo.Industria;
import dev.ropimasi.curso.especialistajava.modulo14.aula05.financeira.servico.ServicoFinanciamento;




public class Principal {

	public static void main(String[] args) {
		var servicoFinanciamento = new ServicoFinanciamento();
		var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
		var industria = new Industria("Alimentos da Vovó", 900_000, true);

		servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
		//        servicoFinanciamento.solicitarFinanciamento(industria, 600_000);
	}

}