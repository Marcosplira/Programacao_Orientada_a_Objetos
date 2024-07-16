package Aulas04;

import java.util.Scanner;

public class Main {

  static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    double opcao = 1, numero1, numero2, resultado = 0;
    CalculadoraA calculadora = new CalculadoraA();

    // while(opcao != 0){
    // opcao = exibeMenu();
    // }

    while (opcao != 0) {
      System.out.println("Informe o primeiro numero: ");
      numero1 = sc.nextInt();

      System.out.println("Informe o segundo numero: ");
      numero2 = sc.nextInt();
      opcao = exibeMenu();

      if (opcao == 1) {
        resultado = calculadora.somar(numero1, numero2);
      }
      if (opcao == 2) {
        resultado = calculadora.subtrair(numero1, numero2);
      }
      if (opcao == 3) {
        resultado = calculadora.multiplicar(numero1, numero2);
      }
      if (opcao == 4) {
        resultado = calculadora.dividir(numero1, numero2);
      }

      System.out.println("Resultado da soma: " + resultado);
    }

    // double r = 1.1, area, area2;

    // area = getArea(r);
    // System.out.println("Resultado da Área: " + area);

    // area2 = getArea(2.2);
    // System.out.println("Resultado da Área: " + area2);
  }

  public static double getArea(double radius) {
    return radius * radius * Math.PI;
  }

  static int exibeMenu() {
    System.out.println("##################MENU######################");
    System.out.println("0 - SAIR");
    // System.out.println("1 - EXIBA");
    System.out.println("1 - SOMAR");
    System.out.println("2 - SUBTRAIR");
    System.out.println("3 - MULTIPLICAR");
    System.out.println("4 - DIVIDIR");
    return sc.nextInt();
  }
}
