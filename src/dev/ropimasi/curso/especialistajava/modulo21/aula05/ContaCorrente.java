package dev.ropimasi.curso.especialistajava.modulo21.aula05;

import java.math.BigDecimal;

public class ContaCorrente {

    private BigDecimal saldo = new BigDecimal("0.00");

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valorSaque) {
        if (valorSaque.compareTo(saldo) > 0) {
            throw new RuntimeException(
                    String.format("Saque: %s, Saldo: %s", valorSaque, saldo));
        }

        saldo = saldo.subtract(valorSaque);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}