package Revisao5;

public class Main {
    public static void main(String[] args) {
        EstradaDeFerro estrada = new EstradaDeFerro();
        estrada.tamanho = 10;
    
        Trem trem = new Trem();
        trem.setDistancia(estrada);
        System.out.println(trem.getDistancia());
        
        
      }
}
