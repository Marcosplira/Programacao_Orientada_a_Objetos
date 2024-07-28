package Revisao13;

public class Gato extends Animal{
    public void alimentar(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
          System.out.println("Gato comendo");
        }
      }
      public void verificarIdade(int idade) {
        if (idade >= 1) {
          System.out.println("Gato adulto");
        } else {
          System.out.println("Gato filhote");
        }
      }
}
