package Aulas08;

public class Main {
    public static void main(String[] args) {
      
      Elevador elevador1 = new Elevador(4, 5);
      elevador1.entra(5);
      elevador1.entra(1);
      elevador1.sai(2);
      elevador1.sai(4);
      elevador1.sobe(5);
      elevador1.sobe(2);
      elevador1.desce(5);
      elevador1.desce(1);
    }
  }