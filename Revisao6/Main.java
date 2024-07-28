package Revisao6;

import Revisao6.Pessoa;

public class Main {
    public static void main(String[] args) {

    String logradouro = "Centro";

    Endereco endereco = new Endereco(logradouro, "Picui", "PB");
    Pessoa pessoa = new Pessoa("João", endereco, "123");
    System.out.println("Cidade: " + endereco.getcidade());   
    System.out.println("Nome da Pessoa: " + pessoa.getnome());
    System.out.println("Cidade da Pessoa: " + pessoa.getendereco().getcidade());
    endereco.setcidade("JP");
    System.out.println("Cidade da Pessoa: " + pessoa.getendereco().getcidade());
    pessoa.getendereco().setcidade("CN");
    System.out.println(endereco.getcidade());
  }
}
