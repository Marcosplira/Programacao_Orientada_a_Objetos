package Revisao13;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        
        cachorro1.verificarIdade(3);
        cachorro2.verificarIdade(1);
        gato1.verificarIdade(2);
        gato2.verificarIdade(0);
        
        cachorro1.alimentar(2);
        cachorro2.alimentar(5);
        gato1.alimentar(1);
        gato2.alimentar(3);
        
        Cachorro cachorro = new Cachorro();
        cachorro.andar(5);
        cachorro.andar(3);
        System.out.println("Total de passos do cachorro: " + cachorro.totalPassos);
      }
}
