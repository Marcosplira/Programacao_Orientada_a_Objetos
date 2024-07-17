package Aulas26;

public class Aluno {
  private String nome;
  private String matricula;
  private double nota1;
  private double nota2;
  private double nota3;

  Aluno(String nome, String matricula, double nota1, double nota2, double nota3){
    this.nome = nome;
    this.matricula = matricula;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }

  public void setNota1(double nota1){
    this.nota1 = nota1;
  }
  public void setNota2(double nota2){
    this.nota2 = nota2;
  }
  public void setNota3(double nota3){
    this.nota3 = nota3;
  }
  public double media(){
    return (nota1 * 2.5) + (nota2 * 2.5) + (nota3 * 2)/7;
  }
  public void finalAluno(){
    if(media() < 7){
      System.out.println("Aluno na prova final - Nota: " + media());
    } else{
      System.out.println("Aluno aprovado - Nota: " + media());
    }
  }
}
