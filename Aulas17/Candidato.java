package Aulas17;

public class Candidato {
    private String nome;
    private int idade;
    private double massaCorporal; 

    public Candidato(String nome, int idade, double massaCorporal) {
        this.nome = nome;
        this.idade = idade;
        this.massaCorporal = massaCorporal;
    }

    public double calcularRitmoCorrida() {
        return idade * 0.1 + (massaCorporal * 0.05);
    }

    public String getNome() {
        return nome;
    }
}
