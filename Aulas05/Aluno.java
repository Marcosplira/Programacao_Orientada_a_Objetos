class Aluno {
  String nome;
  int idade;
  String curso;
  String turno;
  int matricula;
  int cpf;
  double nota1;
  double nota2;
  double nota3;
  double nota4;

  void VerInfo() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Curso: " + curso);
    System.out.println("Turno: " + turno);
    System.out.println("Matricula: " + matricula);
    System.out.println("CPF: " + cpf);
  }

  void DefinirNotas(double notas_1, double notas_2, double notas_3, double notas_4) {
    nota1 = notas_1;
    nota2 = notas_2;
    nota3 = notas_3;
    nota4 = notas_4;

  }

  void DefinirSituacao() {
    double media = (nota1 + nota2 + nota3 + nota4) / 4;
    if (media >= 7) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Reprovado");
    }
  }
}