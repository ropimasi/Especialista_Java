package dev.ropimasi.curso.especialistajava.modulo14.aula04.contaspagar.modelo;

import dev.ropimasi.curso.especialistajava.modulo14.aula04.pagamento.Beneficiario;
import dev.ropimasi.curso.especialistajava.modulo14.aula04.pagamento.DocumentoPagavel;




public class OrdemServico implements DocumentoPagavel {

	private Beneficiario fornecedor;
	private double valorTotal;



	public OrdemServico(Beneficiario fornecedor, double valorTotal) {
		super();
		this.fornecedor = fornecedor;
		this.valorTotal = valorTotal;
	}



	public Beneficiario getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(Beneficiario fornecedor) {
		this.fornecedor = fornecedor;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}



	@Override
	public Beneficiario getBeneficiario() {
		return getFornecedor();
	}

}
