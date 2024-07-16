package Aulas12;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(10, 5);
    
        System.out.println("Nota1: " + aluno1.getNota1());
    
        aluno1.setNota1(4);
    
        System.out.println("Nota1: " + aluno1.getNota1());
        
        System.out.println("Media: " + aluno1.calcularMedia());
        
      
      }
    
}
