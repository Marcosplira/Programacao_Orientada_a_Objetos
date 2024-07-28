package Revisao10;


public class Main {
    public static void main(String[] args) {
    Cachorro cachorro = new Cachorro("Buddy", 3, "Golden Retriever");
    System.out.println("Nome do cachorro: " + cachorro.getNome());
    System.out.println("Idade do cachorro: " + cachorro.getIdade());
    System.out.println("Raça do cachorro: " + cachorro.getRaca());
    
    Gato gato = new Gato("Whiskers", 2);
    System.out.println("Nome do gato: " + gato.getNome());
    System.out.println("Idade do gato: " + gato.getIdade());
    
    Peixe peixe = new Peixe("Nemo", 1);
    System.out.println("Nome do peixe: " + peixe.getNome());
    System.out.println("Idade do peixe: " + peixe.getIdade());
    
    Passaro passaro = new Passaro("Tweety", 4);
    System.out.println("Nome do pássaro: " + passaro.getNome());
    System.out.println("Idade do pássaro: " + passaro.getIdade());
  }
}
