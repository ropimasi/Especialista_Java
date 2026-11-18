package dev.ropimasi.curso.especialistajava.modulo24.aula08;

import java.math.BigDecimal;

public interface Transacao {

    BigDecimal getValorTotal();
    void reembolsar();

}