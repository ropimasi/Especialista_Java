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
		System.out.printf("------------------------%n");
		System.out.printf("Agência: %d%n", getAgencia());
		System.out.printf("Número da Conta: %d%n", getNumero());
		System.out.printf("Titular: %s%n", getTitular().getNome());
		System.out.printf("Saldo: R$ %.2f%n", getSaldo());
		System.out.printf("Saldo disponível: R$ %.2f%n", getSaldoDisponivel());
		System.out.printf("------------------------%n");
	}



	@Override
	protected void validarSaldoParaSaque(double valorSaque) {
		if (valorSaque > getSaldoDisponivel()) {
			throw new IllegalArgumentException("Saldo insuficiente para saque: " + getSaldo());
		}
	}

}
