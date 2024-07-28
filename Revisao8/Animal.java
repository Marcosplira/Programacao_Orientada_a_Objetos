package Revisao8;

public class Animal {
  private String nome;
  private int idade;

  Animal(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  public void emitirSom(){
    System.out.println("Som generico de animal.");
  }
}
