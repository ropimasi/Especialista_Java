package dev.ropimasi.curso.especialistajava.modulo13.aula11;

import dev.ropimasi.curso.especialistajava.modulo13.aula11.fiscal.EmpresaLucroReal;
import dev.ropimasi.curso.especialistajava.modulo13.aula11.fiscal.EmpresaSimples;
import dev.ropimasi.curso.especialistajava.modulo13.aula11.fiscal.GestorImpostos;
import dev.ropimasi.curso.especialistajava.modulo13.aula11.fiscal.PessoaFisica;




public class Principal {

	public static void main(String[] args) {

		GestorImpostos gestor = new GestorImpostos();

		PessoaFisica pf1 = new PessoaFisica("João", 49000);
		PessoaFisica pf2 = new PessoaFisica("Maria", 51000);
		EmpresaSimples pj1 = new EmpresaSimples("Bar do Zé", 95000, 45000);
		EmpresaLucroReal pj2 = new EmpresaLucroReal("Code Consultoria", 160_000, 60_000);
		
		gestor.adicionar(pf1);
		gestor.adicionar(pf2);
		gestor.adicionar(pj1);
		gestor.adicionar(pj2);

		System.out.printf("Total de impostos: R$%.2f%n", gestor.getValorTotalImpostos());

	}

}
