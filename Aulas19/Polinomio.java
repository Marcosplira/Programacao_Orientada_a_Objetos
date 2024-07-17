package Aulas19;

public class Polinomio {
    private double a;
    private double b;
    private double c;

    public Polinomio(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
  public void calcularRaizes() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Raiz única: " + raiz);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Raiz 1: " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("Raiz 2: " + parteReal + " - " + parteImaginaria + "i");
        }
    }
}
