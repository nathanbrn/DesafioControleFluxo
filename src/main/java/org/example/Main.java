package org.example;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Contador count = new Contador();

    System.out.println("Digite o primeiro número:");
    int num = scan.nextInt();
    System.out.println("Digite op segundo número:");
    int num2 = scan.nextInt();

    try {
      count.contar(num, num2);
    } catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
  }
}