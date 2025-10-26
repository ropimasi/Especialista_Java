package dev.ropimasi.curso.especialistajava.modulo13.aula02.banco;

public class CaixaEletronico {

	public static final double TARIFA_TRANSFERENCIA = 2.00;



	public void transferir(ContaEspecial contaOrigem, ContaEspecial contaDestino, double valorTransferencia) {

		System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n", valorTransferencia,
				contaOrigem.getAgencia(), contaOrigem.getNumero(), contaDestino.getAgencia(), contaDestino.getNumero());

		contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
		contaDestino.depositar(valorTransferencia);
	}


	// Sobrecarga sem polimorfismo.
	public void transferir(ContaEspecial contaOrigem, ContaSalario contaDestino, double valorTransferencia) {

		System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n", valorTransferencia,
				contaOrigem.getAgencia(), contaOrigem.getNumero(), contaDestino.getAgencia(), contaDestino.getNumero());

		contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
		contaDestino.depositar(valorTransferencia);
	}

}
