package dev.ropimasi.curso.especialistajava.modulo14.aula08.financeira;

import dev.ropimasi.curso.especialistajava.modulo14.aula08.financeira.modelo.Fazenda;
import dev.ropimasi.curso.especialistajava.modulo14.aula08.financeira.modelo.Funcionario;
import dev.ropimasi.curso.especialistajava.modulo14.aula08.financeira.modelo.Industria;
import dev.ropimasi.curso.especialistajava.modulo14.aula08.financeira.modelo.LojaVarejista;
import dev.ropimasi.curso.especialistajava.modulo14.aula08.financeira.servico.ServicoFinanciamento;




public class Principal {

	public static void main(String[] args) {
		var servicoFinanciamento = new ServicoFinanciamento();

		var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
		var industria = new Industria("Alimentos da Vovó", 900_000, true);
		var lujinia = new LojaVarejista("Lujínia", 321_654, 123_456);
		var funcionario = new Funcionario("Jão da Silva", 15_000);

		servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
		servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
		servicoFinanciamento.solicitarFinanciamento(lujinia, 123_000);
		servicoFinanciamento.solicitarFinanciamento(funcionario, 75_000);

	}

}