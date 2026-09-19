package dev.ropimasi.curso.especialistajava.modulo20.aula03;

public class EndsWith {

    public static void main(String[] args) {
        String nome1 = "João";

        System.out.println(nome1.endsWith("ão")); // true
        System.out.println(nome1.endsWith("ÃO")); // false
        
    }

}
