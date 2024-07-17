package Aulas24;

public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Marcos", "Desenvolvedor", 5000.0);
            System.out.println("Custo Anual do Empregado " + empregado1.nome + ": " + empregado1.custoAnual());
            empregado1.aumento(10); 
            System.out.println("Novo Salário Mensal de " + empregado1.nome + ": " + empregado1.salarioMensal);
        }
}
