package dev.ropimasi.curso.especialistajava.modulo03.desafio_20;

import java.util.Scanner;

public class Desafio5DoWhile {
  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    int somaPar = 0;
    int somaImpar = 0;
    
    do {
      System.out.print("Digite um número inteiro: ");
      int numero = scan.nextInt();
      
      if (numero % 2 == 0) {
        somaPar += numero;
      } else {
        somaImpar += numero;
      }
      
      System.out.print("Digitará mais um número? (0 para não, 1 para sim) ");
      int digitaMais = scan.nextInt();
      if (digitaMais == 0) {
        break;
      }
    } while (true);
  
    System.out.printf("Soma dos números pares: %d%n",somaPar);
    System.out.printf("Soma dos números ímpares: %d%n",somaImpar);
  
  }
}
