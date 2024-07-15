package Aulas01;

public class Main {
    public static void main(String[] args) {
      Carro meuCarro = new Carro();
      System.out.println(meuCarro.ano);
      System.out.println("Ano do Carro: " + meuCarro.ano);
      System.out.println("Velocidade do Carro: " + meuCarro.velocidade);
      System.out.println("Km do Carro: " + meuCarro.km);
      meuCarro.andar(10.0);
      // System.out.println("Cor do Carro: " + meuCarro.cor);
      // System.out.println("Marca do Carro: " + meuCarro.marca);
      // System.out.println("Modelo do Carro: " + meuCarro.modelo);
      System.out.println("Km do Carro: " + meuCarro.km);
      meuCarro.andar(20.5); 
      System.out.println("Km do Carro: " + meuCarro.km);
    }
  }