package dev.ropimasi.curso.especialistajava.modulo16.aula21.banco;

public class ContaCorrente {

	private String numero;
	private double saldo;
	private boolean ativa;



	public ContaCorrente(String numero) {
		this.numero = numero;
	}



	public String getNumero() {
		return numero;
	}



	public double getSaldo() {
		return saldo;
	}



	public boolean isAtiva() {
		return ativa;
	}



	public boolean isInativa() {
		return !isAtiva();
	}



	public void ativar() {
		this.ativa = true;
	}



	public void inativar() {
		this.ativa = false;
	}



	public /*boolean*/ void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor de saque deve ser maior que 0");
			//return false;
			throw new IllegalArgumentException("Valor de saque deve ser maior que 0");
		}

		if (valor > this.saldo) {
			System.out.println("Conta sem saldo");
			//return false;
			throw new IllegalArgumentException("Valor de saque deve ser <= Saldo. Saldo infuficiente.");
		}

		if (isInativa()) {
			System.out.println("Conta inativa");
			//return false;
			throw new IllegalArgumentException("Conta deve estar ativa para sacar");
		}

		this.saldo -= valor;
		//return true;
	}



	public /*boolean*/ void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor de depósito deve ser maior que 0");
			//return false;
			throw new IllegalArgumentException("Valor de depósito deve ser maior que 0");
		}

		if (isInativa()) {
			System.out.println("Conta inativa");
			//return false;
			throw new IllegalArgumentException("Conta deve estar ativa para depositar");
		}

		this.saldo += valor;
		//return true;
	}



	public /*boolean*/ void transferir(ContaCorrente contaDestino, double valor) {
		if (contaDestino.isInativa()) {
			System.out.println("Conta de destino está inativa");
			throw new IllegalArgumentException("Conta de destino deve estar ativa para transferir");
			//return false;
		}

		//if (sacar(valor)) {
		//	contaDestino.depositar(valor);
		//	return true;
		//}
		try {
			sacar(valor);
		} catch (IllegalArgumentException e) {
			System.out.println("Falha na transferência: " + e.getMessage());
			throw new SaldoInsuficienteException("Saldo insuficiente para transferência", e);
		}
		contaDestino.depositar(valor);

		//return false;
	}

}
