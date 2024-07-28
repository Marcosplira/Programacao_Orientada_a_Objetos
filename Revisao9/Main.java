package Revisao9;

public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Nemo", 1);
        Passaro passaro = new Passaro("Papagaio", 2);
         
       peixe.movimentar();
       passaro.emitirSom();
     
       peixe.movimentar();
       passaro.movimentar();
       }
}
