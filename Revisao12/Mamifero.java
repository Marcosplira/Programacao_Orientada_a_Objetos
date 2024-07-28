package Revisao12;

public class Mamifero extends Animal{
  private boolean temPelo;
  
  public Mamifero(boolean temPelo) {
    this.temPelo = temPelo;
  }
  
  public void amamentar() {
    System.out.println("Mamífero amamentando!");
  }
  
  public boolean temPelo() {
    return temPelo;
  }
}
