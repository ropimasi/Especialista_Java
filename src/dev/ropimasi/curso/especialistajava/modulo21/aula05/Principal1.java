package dev.ropimasi.curso.especialistajava.modulo21.aula05;

import java.math.BigDecimal;

public class Principal1 {

    public static void main(String[] args) {
        BigDecimal valorTotal = new BigDecimal("2.05");
        BigDecimal valorPago = new BigDecimal("1.05");

        BigDecimal valorDevido = valorTotal.subtract(valorPago);

        System.out.println(valorDevido);
    }

}