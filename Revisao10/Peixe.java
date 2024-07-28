package Revisao10;

public class Peixe extends Animal{
    public Peixe(String nome, int idade){
        super(nome, idade);
      }
      public void emitirSom(){
        System.out.println("Som do peixe");
      }
      public void movimentar(){
        System.out.println("Peixe nadando");
      }
}
