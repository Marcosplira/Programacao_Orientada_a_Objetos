package Revisao7;

public class Funcionario {
  private double salario;
  private String nome;

  Funcionario(double salario, String nome){
    this.salario = salario;
    this.nome = nome;
  }

  public double getSalario(){
    return this.salario;
  }
  public void setSalario(double salario){
    this.salario = salario;
  }
  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
}
