package Aulas19;

public class Main {
    public static void main(String[] args) {
        double a = 2;
        double b = -6;
        double c = -20;
        Polinomio polinomio = new Polinomio(a, b, c);
        System.out.println("Raízes do polinômio:");
        polinomio.calcularRaizes();
      }
}
