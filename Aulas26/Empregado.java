package Aulas26;

public class Empregado {
    private String nome;
    private String cargo;
    private double salario;
  
    Empregado(String nome, String cargo, double salario){
      this.nome = nome;
      this.cargo = cargo;
      this.salario = salario;
    } 
    public String getNome(){
      return this.nome;
    }
    public void setNome(String nome){
      this.nome = nome;
    }
    public double getSalario(){
      return this.salario;
    }
    public double custoAnual(){
      return salario * 13;
    }
    public void aumento(double aumento){
      this.salario = salario + (salario * (aumento/100));
    }
}
