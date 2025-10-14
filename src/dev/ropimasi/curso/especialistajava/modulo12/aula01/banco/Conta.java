package dev.ropimasi.curso.especialistajava.modulo12.aula01.banco;

public class Conta {

	public static final int NORMAL = 0;
	public static final int INVESTIMENTO = 1;
	public static final int ESPECIAL = 2;

	private Titular titular;
	private int agencia;
	private int numero;
	private double saldo;
	private int tipo = NORMAL; // esta propriedade faz a TAGGED CLASS = má prática!

	// conta investimento.
	private double valorTotalRendimentos;

	// conta especial.
	private double tarifaMensal;
	private double limiteChequeEspecial;



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		if (tipo != NORMAL && tipo != INVESTIMENTO && tipo != ESPECIAL) {
			throw new IllegalArgumentException("Tipo de conta inválido: " + tipo);
		}

		this.tipo = tipo;

		if (tipo != ESPECIAL) {
			this.limiteChequeEspecial = 0;
		}
	}



	public double getValorTotalRendimentos() {
		return valorTotalRendimentos;
	}



	public void creditarRendimentos(double percentualJuros) {
		if (getTipo() == INVESTIMENTO || getTipo() == ESPECIAL) {
			double valorRendimentos = getSaldo() * percentualJuros / 100;
			this.valorTotalRendimentos += valorRendimentos;
			depositar(valorRendimentos);
		} else {
			throw new UnsupportedOperationException(
					"Não é possível creditar rendimentos neste tipo de conta: " + getTipo());
		}
	}



	public static int getNormal() {
		return NORMAL;
	}



	public static int getInvestimento() {
		return INVESTIMENTO;
	}



	public static int getEspecial() {
		return ESPECIAL;
	}



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



	public double getTarifaMensal() {
		return tarifaMensal;
	}



	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}



	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}



	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		if (getTipo() != ESPECIAL) {
			throw new UnsupportedOperationException(
					"Não é possível definir limite de cheque especial neste tipo de conta: " + getTipo());
		}

		this.limiteChequeEspecial = limiteChequeEspecial;
	}



	public void sacar(double valorSaque) {
		if (valorSaque <= 0) {
			throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
		}
		if (valorSaque > getSaldoDisponivel()) {
			throw new IllegalArgumentException("Saldo insuficiente para saque: " + getSaldoDisponivel());
		}
		saldo -= valorSaque;
	}



	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
		}
		saldo += valorDeposito;
	}


	public void debitarTarifaMensal() {
		if (getTipo() == ESPECIAL) {
			sacar(getTarifaMensal());
		} else {
			throw new UnsupportedOperationException(
					"Não é possível debitar tarifa mensal neste tipo de conta: " + getTipo());
		}
	}

	public void imprimirDemonstrativo() {
		System.out.printf("------------------------%n");
		System.out.printf("Agência: %d%n", getAgencia());
		System.out.printf("Número da Conta: %d%n", getNumero());
		System.out.printf("Titular: %s%n", titular.getNome());
		System.out.printf("Saldo: R$ %.2f%n", getSaldo());
		System.out.printf("Saldo disponível: R$ %.2f%n", getSaldoDisponivel());
		System.out.printf("------------------------%n");
	}

}
