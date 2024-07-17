package Revisao1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("José", 10); // instanciando um primeiro objeto da classe Pessoa
        Pessoa pessoa2 = new Pessoa("Maria", 20); // instanciando um segundo objeto da classe Pessoa
         
         //  // construtor
         // pessoa1.apresentar();
         // pessoa2.apresentar();
         
       // //   atributos
       //  pessoa1.nome = "José";
       //  pessoa1.idade = 30;
     
         System.out.println(pessoa1.getNome());
         pessoa1.setNome("João");
         System.out.println(pessoa1.getNome());
     
         System.out.println(pessoa1.getIdade());
         pessoa1.setIdade(11);
         System.out.println(pessoa1.getIdade());
     
         // System.out.println("O nome da pessoa1 é: " + pessoa1.nome);
         // System.out.println("A idade da pessoa1 é: " + pessoa1.idade);
         
         // pessoa2.nome = "Maria";
         // pessoa2.idade = 25;
         // System.out.println("O nome da pessoa2 é: " + pessoa2.nome);
         // System.out.println("A idade da pessoa2 é: " + pessoa2.idade);
         
         // // métodos do objeto pessoa1 e pessoa2
         // pessoa1.apresentar();
         // pessoa2.apresentar();
     
         // pessoa1.nome = "João";
         // pessoa1.apresentar();
     
     
     
         // encapsulamento 
         // public -> todo mundo tem acesso
         // private -> só fica acessível dentro da classe
         // protected -> menos restrito
        // defaut
        }
     
}
