package dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro;

import dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.modelo.Caminhao;
import dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.modelo.CarroParticular;
import dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.modelo.ImovelResidencial;
import dev.ropimasi.curso.especialistajava.modulo14.aula15.seguro.servico.ServicoPropostaSeguro;




public class Principal {

	public static void main(String[] args) {

		ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

		ImovelResidencial imovel1 = new ImovelResidencial(1_000_000, 180);
		ImovelResidencial imovel2 = new ImovelResidencial(400_000, 120);
		CarroParticular carro1 = new CarroParticular("C3 Hatch", 2024, 60_000);
		CarroParticular carro2 = new CarroParticular("Omega", 1998, 10_000);
		Caminhao caminhao1 = new Caminhao("Mercedz 1113", 1990, 71_000, 3);
		Caminhao caminhao2 = new Caminhao("Constelation", 2010, 175_000, 4);

		servicoPropostaSeguro.emitir(imovel1);
		servicoPropostaSeguro.emitir(imovel2);
		servicoPropostaSeguro.emitir(carro1);
		servicoPropostaSeguro.emitir(carro2);
		servicoPropostaSeguro.emitir(caminhao1);
		servicoPropostaSeguro.emitir(caminhao2);

	}

}
