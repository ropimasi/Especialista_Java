package dev.ropimasi.curso.especialistajava.modulo21.aula03;

public class Round {

    public static void main(String[] args) {
        double x = 300.4;
        double y = 300.5;

        System.out.println(Math.round(x));
        System.out.println(Math.round(y));
        System.out.println(Math.round(x) == Math.round(y));
        
        y = 300.3;
        System.out.println(Math.round(x));        
        System.out.println(Math.round(x) == Math.round(y));
    }

}