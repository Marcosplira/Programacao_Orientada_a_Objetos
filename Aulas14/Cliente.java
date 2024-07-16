package Aulas14;

public class Cliente {
  String nome, endereco; 
  float renda;

  Cliente(String nome, String endereco, float renda){
    this.nome = nome;
    this.endereco = endereco;
    this.renda = renda;
  }
  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getEndereco(){
    return this.endereco;
  }
  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
  public float getRenda(){
    return this.renda;
  }
  public void setRenda(float renda){
    this.renda = renda;
  }
}
