package Aulas26;
import java.util.ArrayList;

public class Prova {
  private String nome;
  private String matricula;
  private String turma;
  public ArrayList<String> questoes = new ArrayList<String>();


  Prova(String nome, String matricula, String turma){
    this.nome = nome;
    this.matricula = matricula;
    this.turma = turma;
  }
}
