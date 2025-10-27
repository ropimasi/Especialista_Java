package dev.ropimasi.curso.especialistajava.modulo13.aula06.banco;

public class CaixaEletronico {

	public static final double TARIFA_TRANSFERENCIA = 2.00;
	public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 1.00;



	public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {

		System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n", valorTransferencia,
				contaOrigem.getAgencia(), contaOrigem.getNumero(), contaDestino.getAgencia(), contaDestino.getNumero());

		contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
		contaDestino.depositar(valorTransferencia);
	}



	public void imprimirDemonstrativo(Conta conta) {

		if ((conta instanceof ContaInvestimento contaInvestimento)
				&& (contaInvestimento.getValorTotalRendimentos() > 0)) {
			// ContaInvestimento contaInvestimento = (ContaInvestimento) conta;
			System.out.println("Impressão do demonstrativo é gratuita.");
		} else {
			debitarTarifaImpressaoDemonstrativo(conta);
		}

		conta.imprimirDemonstrativo();
	}



	protected void debitarTarifaImpressaoDemonstrativo(Conta conta) {
		System.out.printf("Custo da impressão: R$%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
		conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
	}

}
