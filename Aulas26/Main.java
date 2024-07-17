package Aulas26;
import java.util.Scanner;

import Aulas26.Gabarito;
import Aulas26.Prova;
import Aulas26.Secretaria;
import Aulas26.Empregado;
import Aulas26.Aluno;
import Aulas26.Cliente;
import Aulas26.Consulta;

public class Main {
    public static void main(String[] args) {
    // Questão 1
    Prova prova1 = new Prova("José", "12121", "TSI");

    Gabarito gab = new Gabarito(prova1);
    gab.receberResposta("B");
    gab.receberResposta("B");
    gab.receberResposta("C");
    gab.receberResposta("D");
    gab.receberResposta("E");
    gab.acertos();

    System.out.println("Total de Acertos: " + gab.getNota());


    
    // Questão 2
    Secretaria f = new Secretaria();
    f.nome = "Maria";
    f.cpf = "123.456.789-00";
    f.cadastro("Luciano", "CN", "012132", "Cachorro", "Pitbull", 3);
    f.marcarConsulta("Luciano", "Cachorro", "Pitbull", 3);

    // Questão 3 
    Empregado emp = new Empregado("Luciano", "Veterinário", 1000);
    
    System.out.println("Custo anual: " + emp.custoAnual());
    System.out.println("Nome do empregado: " + emp.getNome());
    
    emp.aumento(1);
    
    System.out.println("Salario: " + emp.getSalario());
    System.out.println("Custo anual: " + emp.custoAnual());
    
    // Questão 4
    Aluno aluno = new Aluno("José", "12121212", 8, 9, 10);

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a primeira nota: ");
    double nota1 = sc.nextInt();
    System.out.println("Digite a segunda nota: ");
    double nota2 = sc.nextInt();
    System.out.println("Digite a terceira nota: ");
    double nota3 = sc.nextInt();

    aluno.setNota1(nota1);
    aluno.setNota2(nota2);
    aluno.setNota3(nota3);


    aluno.finalAluno();
  }
}
