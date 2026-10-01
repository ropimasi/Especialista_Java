package dev.ropimasi.curso.especialistajava.modulo21.aula03;

public class Floor {

    public static void main(String[] args) {
        double x = 300.1;
        double y = 300.9;

        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));
        System.out.println(Math.floor(x) == Math.floor(y));
    }

}