package dev.ropimasi.curso.especialistajava.modulo12.aula07.banco;

public class ContaEspecial extends ContaInvestimento {

	private double tarifaMensal;
	private double limiteChequeEspecial;



	public double getTarifaMensal() {
		return tarifaMensal;
	}



	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}



	public void debitarTarifaMensal() {
		sacar(getTarifaMensal());
	}



	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}



	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}



	public double getSaldoDisponivel() {
		return getSaldo() + getLimiteChequeEspecial();
	}



	@Override
	public void imprimirDemonstrativo() {
		/*super.imprimirDemonstrativo(); não utilizar este nesta aula. */
		System.out.printf("------------------------%n");
		System.out.printf("Agência: %d%n", getAgencia());
		System.out.printf("Número da Conta: %d%n", getNumero());
		System.out.printf("Titular: %s%n", getTitular().getNome());
		System.out.printf("Saldo: R$ %.2f%n", getSaldo());
		System.out.printf("Saldo disponível: R$ %.2f%n", getSaldoDisponivel());
		System.out.printf("------------------------%n");
	}



	@Override
	public void sacar(double valorSaque) {
		/*super.sacar(valorSaque);  não utilizar este nesta aula. */
		if (valorSaque <= 0) {
			throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
		}
		if (valorSaque > getSaldoDisponivel()) {
			throw new IllegalArgumentException("Saldo insuficiente para saque: " + getSaldoDisponivel());
		}
		saldo -= valorSaque;

	}

}
