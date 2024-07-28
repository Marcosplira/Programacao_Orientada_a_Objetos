package Revisao10;

public class Passaro extends Animal{
    public Passaro(String nome, int idade){
        super(nome, idade);
      }
      public void emitirSom(){
        System.out.println("Piu piu");
      }
      public void movimentar(){
        System.out.println("Passaro voando");
      }
}
