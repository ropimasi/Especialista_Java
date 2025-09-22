package dev.ropimasi.curso.especialistajava.modulo05.desafio_25;
public class Principal3 {

    public static void main(String[] args) {
        Funcionario3 funcionario = new Funcionario3();
        funcionario.nome = "João da Silva";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho3 contratoTrabalho = new ContratoTrabalho3();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 51.8;
        contratoTrabalho.valorHoraExtra = 60.5;

        FolhaPagamento3 folhaPagamento = new FolhaPagamento3();

        Holerite3 holerite = folhaPagamento.calcularSalario(160, 10, contratoTrabalho);
        holerite.imprimir();
    }

}
