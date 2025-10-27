package dev.ropimasi.curso.especialistajava.modulo13.aula03;

import dev.ropimasi.curso.especialistajava.modulo13.aula03.banco.CaixaEletronico;
import dev.ropimasi.curso.especialistajava.modulo13.aula03.banco.ContaEspecial;
import dev.ropimasi.curso.especialistajava.modulo13.aula03.banco.ContaSalario;
import dev.ropimasi.curso.especialistajava.modulo13.aula03.banco.Titular;




public class Principal4 {

	public static void main(String[] args) {

		CaixaEletronico caixaEletronico = new CaixaEletronico();

		Titular titular1 = new Titular("João da Silva", "12345678900");
		Titular titular2 = new Titular("Maria da Silva", "32165498700");
		Titular titular3 = new Titular("Ronaldo da Silva", "78945612300");

		ContaEspecial conta1 = new ContaEspecial(titular1, 1234, 999999, 10.00);
		conta1.setLimiteChequeEspecial(1000);
		conta1.depositar(500.00);

		ContaEspecial conta2 = new ContaEspecial(titular2, 4321, 888888, 10.00);
		conta2.depositar(400.00);
		
		ContaSalario conta3 = new ContaSalario(titular3, 3333, 777777, 10000.00);

		caixaEletronico.transferir(conta2, conta3, 300.00);
		caixaEletronico.transferir(conta3, conta1, 200.00);
		caixaEletronico.transferir(conta1, conta3, 1200.00);
		conta1.imprimirDemonstrativo();
		conta2.imprimirDemonstrativo();
		conta3.imprimirDemonstrativo();
	}

}
