package Revisao5;

public class Trem {
  private double distancia;
  private EstradaDeFerro estrada;
  
  public void setDistancia(EstradaDeFerro estrada){
    this.distancia = estrada.tamanho;
  }

  public double getDistancia(){
    return this.distancia;
  }
}
