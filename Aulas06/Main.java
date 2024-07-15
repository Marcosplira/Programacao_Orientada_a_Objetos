package Aulas06;

public class Main {
    public static void main(String[] args) {
      Elevador elevador1 = new Elevador(); 
      elevador1.andarAtual = 2;
      elevador1.totalAndares = 10;
      elevador1.capacidade = 5;
      elevador1.pessoas = 2;
      elevador1.entra();
      elevador1.sai(); 
      elevador1.sobe();
      elevador1.desce();
      System.out.println("Andar atual: " + elevador1.andarAtual);
      System.out.println("Total Andares: " + elevador1.totalAndares);
      System.out.println("Capacidade: " + elevador1.capacidade);
      System.out.println("Pessoas: " + elevador1.pessoas);
    }
  }