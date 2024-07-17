package Aulas25;

public class Aluno {
    private String nome;
    private int matricula;
    private double av1;
    private double av2;
    private double trabalho;
    public Aluno(String nome, int matricula, double av1, double av2, double trabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.av1 = av1;
        this.av2 = av2;
        this.trabalho = trabalho;
    }
    public double calcularMedia() {
        return (av1 * 2.5 + av2 * 2.5 + trabalho * 2) / 7.5;
    }
    public boolean irParaProvaFinal() {
        return calcularMedia() < 7.0;
    }
}
