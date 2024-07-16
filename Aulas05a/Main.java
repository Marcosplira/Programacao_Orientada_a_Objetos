package Aulas05a; 

public class Main {
  public static void main(String[] args) {
      Aluno aluno = new Aluno();
      aluno.nome = "João";
      aluno.idade = 20;
      aluno.curso = "Sistemas de Informação";
      aluno.turno = "Matutino";
      aluno.matricula = 2023;
      aluno.cpf = 123456789;
    aluno.VerInfo();
    aluno.DefinirNotas(7, 8, 9, 10);
    aluno.DefinirSituacao();  
  }
}