package Revisao9;

public class Passaro extends Animal{
    Passaro(String nome, int idade){
        super(nome, idade);
      }
      public void emitirSom(){
        System.out.println("Piu piu");
      }
      public void movimentar(){
        System.out.println("Passaro voando");
      }
}
