package Aulas25;
import java.util.Scanner;

import Aulas25.Aluno;
public class Main {
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = input.nextLine();
        System.out.println("Digite a matrícula do aluno:");
        int matricula = input.nextInt();
        System.out.println("Digite a nota da avaliação 1:");
        double av1 = input.nextDouble();
        System.out.println("Digite a nota da avaliação 2:");
        double av2 = input.nextDouble();
        System.out.println("Digite a nota do trabalho:");
        double trabalho = input.nextDouble();
        Aluno aluno = new Aluno(nome, matricula, av1, av2, trabalho);
        System.out.println("Média final do aluno: " + aluno.calcularMedia());
        if (aluno.irParaProvaFinal()) {
            System.out.println("Aluno deve ir para a prova final.");
        } else {
            System.out.println("Aluno não precisa ir para a prova final.");
      }
    input.close();
 }
}
