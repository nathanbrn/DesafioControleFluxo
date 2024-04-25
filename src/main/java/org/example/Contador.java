package org.example;

public class Contador {
  public void contar(int num, int num2) throws ParametrosInvalidosException {
    //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if (num > num2) {
      throw new ParametrosInvalidosException();
    }


    int contagem = num2 - num;
    //realizar o for para imprimir os números com base na variável contagem
    for (int i = 0; i <= contagem; i++) {
      System.out.println(i+1);
    }
  }
}
