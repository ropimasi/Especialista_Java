package dev.ropimasi.curso.especialistajava.modulo12.aula02.banco;

public class Conta {

	public static final int NORMAL = 0;
	public static final int INVESTIMENTO = 1;
	public static final int ESPECIAL = 2;

	private Titular titular;
	private int agencia;
	private int numero;
	private double saldo;
	private int tipo = NORMAL;

	// Var de conta investimento.
	private double valorTotalRendimentos;

	// Var de conta especial.
	private double limiteChequeEspecial;
	private double tarifaMensal;



	public Titular getTitular() {
		return titular;
	}



	public void setTitular(Titular titular) {
		this.titular = titular;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public double getSaldo() {
		return saldo;
	}



	public double getSaldoDisponivel() {
		return getSaldo() + getLimiteChequeEspecial();
	}



	public void sacar(double valorSaque) {
		if (valorSaque <= 0) {
			throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
		}
		if (valorSaque > getSaldoDisponivel()) {
			throw new IllegalArgumentException("Saldo insuficiente para saque");
		}
		saldo -= valorSaque;
	}



	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
		}
		saldo += valorDeposito;
	}



	public void imprimirDemonstrativo() {
		System.out.printf("------------------------%n");
		System.out.printf("Agência: %d%n", agencia);
		System.out.printf("Número da Conta: %d%n", numero);
		System.out.printf("Titular: %s%n", titular.getNome());
		System.out.printf("Saldo: R$ %.2f%n", getSaldo());
		System.out.printf("Saldo disponível: R$ %.2f%n", getSaldoDisponivel());
		System.out.printf("------------------------%n");
	}



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		if (tipo != NORMAL && tipo != INVESTIMENTO && tipo != ESPECIAL) {
			throw new IllegalArgumentException("Tipo de conta inválido: " + tipo);
		}

		this.tipo = tipo;

		if (getTipo() != ESPECIAL) {
			this.limiteChequeEspecial = 0;
		}
	}



	public double getValorTotalRendimentos() {
		return valorTotalRendimentos;
	}



	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}



	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		if (getTipo() != ESPECIAL) {
			throw new UnsupportedOperationException(
					"Limite de cheque especial só pode ser definido para contas do tipo ESPECIAL");
		}
		this.limiteChequeEspecial = limiteChequeEspecial;
	}



	public double getTarifaMensal() {
		return tarifaMensal;
	}



	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}



	public void creditarRendimentos(double percentualJuros) {
		if (tipo != INVESTIMENTO && tipo != ESPECIAL) {
			throw new UnsupportedOperationException(
					"Crédito de rendimentos indisponível para este tipo de conta: " + getTipo());
		}
		double valorRendimento = getSaldo() * percentualJuros / 100;
		this.valorTotalRendimentos += valorRendimento;
		depositar(valorRendimento);
	}



	public void debitarTarifaMensal() {
		if (getTipo() == ESPECIAL) {
			sacar(getTarifaMensal());
		} else {
			throw new UnsupportedOperationException(
					"Débito de tarifa mensal só pode ser realizado para contas do tipo ESPECIAL");
		}
	}

}
