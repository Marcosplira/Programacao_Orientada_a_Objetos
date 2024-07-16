package Aulas17;

public class ControleRemoto {
    private Televisao televisao;

  ControleRemoto(Televisao televisao) {
    this.televisao = televisao;
  }

  public void aumentarVolume() {
    televisao.aumentarVolume();
  }

  public void diminuirVolume() {
    televisao.diminuirVolume();
  }

  public void aumentarCanal() {
    televisao.aumentarCanal();
  }

  public void diminuitCanal() {
    televisao.diminuirCanal();
  }

  public void trocarCanal(int canal) {
    televisao.setCanal(canal);
  }
}
