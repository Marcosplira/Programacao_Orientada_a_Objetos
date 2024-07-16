package Aulas15;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(100.0, 50.0, 10.0, 500.0);
        double tempoViagem = meuCarro.partida();
        if (tempoViagem > 0) {
          System.out.println("Tempo necessário para percorrer a distância: " + tempoViagem + " horas");
        } else {
          System.out.println("Não há combustível suficiente para percorrer a distância configurada.");
        }
      }
}
