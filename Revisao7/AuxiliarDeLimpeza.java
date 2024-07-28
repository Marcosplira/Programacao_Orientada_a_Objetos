package Revisao7;

public class AuxiliarDeLimpeza extends Funcionario {
    private String horarioDeInicio;

  AuxiliarDeLimpeza(double salario, String nome){
    super(salario, nome);
  }


  public String gethorarioDeInicio(){
    return this.horarioDeInicio;
  }
  public void sethorarioDeInicio(String horarioDeInicio){
    this.horarioDeInicio = horarioDeInicio;
  }
}
