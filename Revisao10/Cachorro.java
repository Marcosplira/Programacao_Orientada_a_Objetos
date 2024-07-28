package Revisao10;

public class Cachorro extends Animal {
  private String raca;

  public Cachorro(String nome, int idade, String raca){
    super(nome, idade);
    this.raca = raca;
  }
  public void emitirSom(){
    System.out.println("Latino");
  }
  public void movimentar(){
    System.out.println("Cachorro correndo");
  }
  public String getRaca(){
    return this.raca;
  }
}
