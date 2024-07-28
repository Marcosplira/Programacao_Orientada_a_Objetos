package Revisao13;

public class Mamifero extends Animal{
    int totalPassos = 0;
    public void andar(int passos) {
      totalPassos += passos;
      System.out.println("Mamífero andou " + passos + " passos");
    }
}
