package Revisao10;

public class Gato extends Animal{
    public Gato(String nome, int idade){
        super(nome, idade);
      }
      public void emitirSom(){
        System.out.println("Miado");
      }
      public void movimentar(){
        System.out.println("Gato se movendo");
      }
}
