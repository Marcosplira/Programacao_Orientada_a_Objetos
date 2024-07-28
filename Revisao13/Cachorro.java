package Revisao13;


public class Cachorro extends Mamifero{
    public void alimentar(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
          System.out.println("Cachorro comendo");
        }
      }
      public void verificarIdade(int idade) {
        if (idade >= 2) {
          System.out.println("Cachorro adulto");
        } else {
          System.out.println("Cachorro filhote");
        }
      }
      public void andar(int passos) {
        totalPassos += passos;
        System.out.println("Cachorro andou " + passos + " passos");
      }
}
