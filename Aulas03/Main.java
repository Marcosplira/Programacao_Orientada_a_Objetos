public class Main {
  public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
    cachorro.nome = "Rex";
    cachorro.raça = "Pastor Alemão";
    cachorro.tamanho = 50;
    System.out.println(cachorro.peso);
    System.out.println(cachorro.nome);
    System.out.println(cachorro.raça);
    System.out.println(cachorro.tamanho);
    cachorro.exibeInfo();
    cachorro.latir();
    cachorro.correr();
    cachorro.beber();
    cachorro.andar();
    cachorro.dormir();
  }
}