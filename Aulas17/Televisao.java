package Aulas17;

public class Televisao {
    private int volume;
  private int canal;
  private int volumeMaximo = 100;
  private int totalDeCanais = 30;

  public int getVolume() {
    return volume;
  }

  public void aumentarVolume() {
    if (this.volume < volumeMaximo) {
      this.volume++;
    }
  }

  public void diminuirVolume() {
    if (this.volume > 0) {
      this.volume--;
    }
  }

  public int getCanal() {
    return this.canal;
  }

  public void setCanal(int canal) {
    if (canal > 0 && canal <= this.totalDeCanais) {
      this.canal = canal;
    }
  }

  public void aumentarCanal() {
    if (this.canal == totalDeCanais) {
      this.canal = 1;
    } else {
      this.canal++;
    }
  }

  public void diminuirCanal() {
    if (this.canal == 1) {
      this.canal = totalDeCanais;
    } else {
      this.canal--;
    }
  }
}
