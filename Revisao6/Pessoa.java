package Revisao6;

public class Pessoa {
  private String nome;
  private Endereco endereco = new Endereco("Centro", "Picui", "PB");
  private String numero;

  Pessoa(String nome, Endereco endereco, String numero){
    this.nome = nome;
    this.endereco = endereco;
    this.numero = numero;
  }

  public String getnome(){
    return this.nome;
  }
  public void setnome(String nome){
    this.nome = nome;
  }
  public Endereco getendereco(){
    return this.endereco;
  }
  public void setendereco(Endereco endereco){
    this.endereco = endereco;
  }
  public String getnumero(){
    return this.numero;
  }
  public void setnumero(String numero){
    this.numero = numero;
  }
}
