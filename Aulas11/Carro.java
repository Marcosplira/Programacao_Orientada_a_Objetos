package Aulas11;

public class Carro {
  Motor motor;
  Direcao direcao; 


  boolean ligar(){
    boolean ligou = motor.acionar();

    if (ligou){
      return true;
    }else{
      return false;
    }
  }
  boolean desligar(){
    boolean desligou = motor.desligar();

    if (desligou){
      return true;
    }else{
      return false;
    }
  }
}
