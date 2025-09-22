package dev.ropimasi.curso.especialistajava.modulo03.desafio_20;

import java.util.Scanner;

public class Desafio3While {
  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    int soma = 0;
    
    while (soma < 100) {
      System.out.print("Digite um número inteiro: ");
      soma += scan.nextInt();
    }
    
    System.out.printf("Total da soma: %d%n", soma);
  }
}
