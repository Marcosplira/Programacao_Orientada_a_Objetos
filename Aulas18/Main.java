package Aulas18;

public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
    
        celular1.enviarMensagem(celular2, "Boa Tarde");
        celular1.enviarMensagem(celular2, "Tudo bem?");
    
        celular2.checarMesangens();
    
        celular2.enviarMensagem(celular1, "Boa tarde.");
        celular2.enviarMensagem(celular1, "Tudo bem sim, e com você?");
    
        celular1.checarMesangens();
      }
    
}
