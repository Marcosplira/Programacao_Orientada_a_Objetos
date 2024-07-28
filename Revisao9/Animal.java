package Revisao9;

public class Animal {
  private String nome;
  private int idade;

  Animal(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  public void movimentar() {
    System.out.println("Animal se movendo");
  }
}
