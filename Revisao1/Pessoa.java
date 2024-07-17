package Revisao1;
import java.awt.SystemColor;
public class Pessoa {
    // atributos
  private String nome;
  private int idade;

  // construtor
  Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  // encapsulamento
  
  // métodos

  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  
  public int getIdade(){
    return this.idade;
  }
  public void setIdade(int idade){
    this.idade = idade;
  }
  
  void apresentar(){
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);

     // System.out.println("Nome: " + nome + "Idade: " + idade);


    
  }
}
