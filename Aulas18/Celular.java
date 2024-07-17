package Aulas18;
import java.util.ArrayList;
public class Celular {
    private ArrayList<String> mensagens = new ArrayList<String>();

  public void enviarMensagem(Celular cel, String mensagem) {
    cel.receberMensagem(mensagem);
  }

  public void receberMensagem(String mensagem) {
    mensagens.add(mensagem);
  }

  public void checarMesangens() {
    for (String msg : mensagens) {
      System.out.println(msg);
    }
  }
}
