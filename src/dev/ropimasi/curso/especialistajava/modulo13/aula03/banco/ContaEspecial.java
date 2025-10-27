package dev.ropimasi.curso.especialistajava.modulo13.aula03.banco;

public final class ContaEspecial extends ContaInvestimento {

	private double tarifaMensal;
	private double limiteChequeEspecial;



	public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
		super(titular, agencia, numero);
		this.tarifaMensal = tarifaMensal;
	}



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
		super.imprimirDemonstrativo();

		System.out.printf("Saldo disponível: R$ %.2f%n", getSaldoDisponivel());
	}



	@Override
	protected void validarSaldoParaSaque(double valorSaque) {
		if (valorSaque > getSaldoDisponivel()) {
			throw new IllegalArgumentException("Saldo insuficiente para saque: " + getSaldo());
		}
	}



	@Override
	public String toString() {
		return "ContaEspecial [tarifaMensal=" + tarifaMensal + ", limiteChequeEspecial=" + limiteChequeEspecial + "] "
				+ super.toString();
	}

}
