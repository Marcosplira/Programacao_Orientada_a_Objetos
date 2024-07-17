package Aulas24;

public class Empregado {
    String nome;
    String cargo;
    double salarioMensal;
    public Empregado(String nome, String cargo, double salarioMensal) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioMensal = salarioMensal;
    }
    public double custoAnual() {
        return this.salarioMensal * 12; 
    }
    public void aumento(double percentual) {
        this.salarioMensal += this.salarioMensal * (percentual / 100); 
    }
}
