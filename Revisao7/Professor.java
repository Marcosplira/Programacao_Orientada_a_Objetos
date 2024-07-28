package Revisao7;

public class Professor extends Funcionario{
  private String formacao;
  private String disciplina;

Professor(double salario, String nome, String formacao, String disciplina){
  super(salario, nome);
  this.formacao = formacao;
  this.disciplina = disciplina;
}

  public String getformacao(){
    return this.formacao;
  }
  public void setformacao(String formacao){
    this.formacao = formacao;
  }
  public String getdisciplina(){
    return this.disciplina;
  }
  public void setdisciplina(String disciplina){
    this.disciplina = disciplina;
  }
}
