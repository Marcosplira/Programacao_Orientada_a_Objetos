package Revisao6;

public class Endereco {
    private String logradouro;
  private String cidade;
  private String estado;

  Endereco(String logradouro, String cidade, String estado){
    this.logradouro = logradouro;
    this.cidade = cidade;
    this.estado = estado;
  }

  public String getloagradouro(){
    return this.logradouro;
  }
  public void setlogradouro(String logradouro){
    this.logradouro = logradouro;
  }
  public String getcidade(){
    return this.cidade;
  }
  public void setcidade(String cidade){
    this.cidade = cidade;
  }
  public String getestado(){
    return this.estado;
  }
  public void setestado(String estado){
    this.estado = estado;
  }
}
