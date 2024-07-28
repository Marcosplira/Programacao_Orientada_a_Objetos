package Revisao9;

public class Peixe extends Animal {
    Peixe(String nome, int idade){
        super(nome, idade);
      }
      public void movimentar(){
        System.out.println("Peixe nadando");
      }
      public void emitirSom(){
        System.out.println("Som de peixe");
      }
}
