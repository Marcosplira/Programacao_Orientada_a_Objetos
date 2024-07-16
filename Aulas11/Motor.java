package Aulas11;

public class Motor {
  private String marca;
  private String modelo; 
  private String ano;
  private String pontecia;
  private String cilindradas;
  private Combustivel combustivel;

  public boolean acionar(){
    
    System.out.println("Acionar o motor...");
    
    return true;
  }

  public boolean desligar(){
    
    System.out.println("Desligando motor...");
    
    return true;
  }
}
