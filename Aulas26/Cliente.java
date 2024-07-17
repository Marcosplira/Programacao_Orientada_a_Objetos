package Aulas26;
import java.util.Scanner; 

public class Cliente {
  String nome;
  String cpf;
  String endereco;
  String nomeAnimal;
  String raca;
  int idadeAnimal;

  Cliente(String nome, String cpf, String endereco, String nomeAnimal, String raca, int idade){
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.nomeAnimal = nomeAnimal;
    this.raca = raca;
    this.idadeAnimal = idade;
  }

  public void solicitarConsulta(){
    Secretaria sec = new Secretaria();
    sec.marcarConsulta(nome, nomeAnimal, raca, idadeAnimal);
    
  }
}
