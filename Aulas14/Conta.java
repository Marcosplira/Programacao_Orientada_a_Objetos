package Aulas14;

public class Conta {
  private static int totalDeContas = 0;
  double saldo;
  String cliente;
  Conta(double saldo, String cliente){
    this.saldo = saldo;
    this.cliente = cliente;

  }
  public Conta(){
    Conta.totalDeContas = Conta.totalDeContas + 1;
  }
  
  public double getsaldo(){
    return this.saldo;
  }
  public void setsaldo(double saldo){

    if (saldo < 0){
      this.saldo = 0;
    }else{
      this.saldo = saldo;
    }
  }
  public String getcliente(){
    return this.cliente;
  }
  public void setcliente(String cliente){
    this.cliente = cliente;
  }
}
