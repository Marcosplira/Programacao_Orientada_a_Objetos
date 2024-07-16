package Aulas12;

public class Aluno {
    private double nota1, nota2, media;

  Aluno(double n1, double n2){
    this.nota1 = n1;
    this.nota2 = n2; 
  }

  public double getNota1(){
    return this.nota1;
  }
  public void setNota1(double n1){
    this.nota1 = n1;
  }

  public double getNota2(){
    return this.nota2;
  }
  public void setNota2(double n2){
    this.nota2 = n2;
  }
  public double getMedia(){
    return this.media;
  }
  public void setMedia(double m){
    this.media = m;
  }
  
  void situacaoAluno(){
    if (calcularMedia() >= 6){
      System.out.println("Aprovado"); 
    }else{
      System.out.println("Reprovado"); 
    }
  }
  void participaProjeto(){
    if (calcularMedia() >= 7){
      System.out.println("Pode participar do projeto."); 
    }else{
      System.out.println("Não pode participar do projeto."); 
    }
  } 
  double calcularMedia(){
    media = (nota1 + nota2) / 2;
    return media;
  }
}
