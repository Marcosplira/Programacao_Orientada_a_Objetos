package Aulas02;

// public class Main {
    //   public static void main(String[] args) {
    //     Calculadora calc = new Calculadora();
    //     calc.somar(10);
    //     calc.subtrair(5);
    //     calc.multiplicar(2);
    //     calc.dividir(2);
    //     System.out.println("resultado: " + calc.numero);
    //   }
    // }

public class Main {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma: " + calculadora.somar(10, 5));
        System.out.println("Substacao: " + calculadora.subtrair(10, 5));
        System.out.println("multiplicacao: " + calculadora.multiplicar(10, 5));
        System.out.println("dividir: " + calculadora.dividir(10, 5));
      }
}

