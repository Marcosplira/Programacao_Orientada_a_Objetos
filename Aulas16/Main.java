package Aulas16;

public class Main {
    public static void main(String[] args) {
        Televisao tel = new Televisao();
    
        ControleRemoto cr = new ControleRemoto(tel);
    
        System.out.println("Canal Atual: " + tel.getCanal());
        System.out.println("Volume Atual: " + tel.getVolume());
    
        cr.aumentarCanal();
        cr.aumentarVolume();
    
        System.out.println("Canal Atual: " + tel.getCanal());
        System.out.println("Volume Atual: " + tel.getVolume());
    
        cr.trocarCanal(5);
    
        System.out.println("Canal Atual: " + tel.getCanal());
        System.out.println("Volume Atual: " + tel.getVolume());
    
        cr.diminuirVolume();
        cr.diminuitCanal();
    
        System.out.println("Canal Atual: " + tel.getCanal());
        System.out.println("Volume Atual: " + tel.getVolume());
      }
    
}
