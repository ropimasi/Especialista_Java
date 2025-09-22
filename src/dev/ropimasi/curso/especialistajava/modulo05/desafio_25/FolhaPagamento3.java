package dev.ropimasi.curso.especialistajava.modulo05.desafio_25;
public class FolhaPagamento3 {

    Holerite3 calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho3 contrato) {
        Holerite3 holerite = new Holerite3();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHorasNormais = horasNormais * contrato.valorHoraNormal;
        holerite.valorTotalHorasExtras = horasExtras * contrato.valorHoraExtra;

        double subtotal = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            holerite.adicionalParaFilhos = subtotal * 0.10;
        }

        return holerite;
    }

}
