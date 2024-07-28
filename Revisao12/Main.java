package Revisao12;

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero(true);
        mamifero.amamentar();
        
        Cachorro cachorro = new Cachorro(true);
        cachorro.latir();
        System.out.println("O cachorro tem pelo? " + cachorro.temPelo());
      }
}
