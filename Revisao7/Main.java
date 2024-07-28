package Revisao7;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario(2000, "João");
        // func1.setNome("João");
        // func1.setSalario(2000);
        System.out.println("Nome do Funcionario 1: " + func1.getNome());
        System.out.println("Salario do Funcionario 1: " + func1.getSalario());
    
    
        Professor pro1 = new Professor(2000, "Marcos", "TSI", "POO");
        pro1.setformacao("TSI");
        pro1.setdisciplina("POO");
        // pro1.setNome("Marcos");
        // pro1.setSalario(1000);
        System.out.println("Nome do Professor: " + pro1.getNome());
        System.out.println("Salario do Professor: " + pro1.getSalario());
        System.out.println("Formacao do Professor: " + pro1.getformacao());
        System.out.println("Disciplina do Professor: " + pro1.getdisciplina());
    
        // Coordenador coord1 = new Coordenador(2000, "Lucius", "TSI", "POO");
        // coord1.setCurso("Informática");
        // coord1.setformacao("CC");
        // coord1.setNome("Lucius");
      }
}
