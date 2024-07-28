package Revisao11;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Luna");
        Passaro passaro = new Passaro("Piu", "Pequenas");
        
        cachorro.correr();
        gato.escalarArvore();
        System.out.println("Tipo de asa do pássaro: " + passaro.getTipoDeAsa());
      }
}
