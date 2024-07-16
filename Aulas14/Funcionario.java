package Aulas14;

public class Funcionario {
  String nome; 
  double matricula; 
  double salario; 
  String cargo;
  
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
  this.nome = nome;
}
  public double getMatricula(){
    return matricula;
  }
  public void setMatricula(double matricula){
    this.matricula = matricula;
  }
  public double getSalario(){
    return salario;
  }
  public void setSalario(double salario){
    this.salario = salario;
  }
  public String getCargo(){
    return cargo;
  }
  public void setCargo(String cargo){
    this.cargo = cargo;
  }
}
