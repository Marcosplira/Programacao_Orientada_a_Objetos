package Revisao2;

public class Aluno {
  private String nome;
  private int matricula;

  public void estudar(){
    System.out.println("Estudando");
  }
  public String retornarDados(){
    return "Nome: " + nome + " Matricula: " + matricula;
  }
}
