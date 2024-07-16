package Aulas15;

public class Carro {
    private double velocidade;
    private double combustivel;
    private double autonomia;
    private double distancia;
    public Carro(double velocidade, double combustivel, double autonomia, double distancia) {
        this.velocidade = velocidade;
        this.combustivel = combustivel;
        this.autonomia = autonomia;
        this.distancia = distancia;
    }
    public double partida() {
        double tempo = distancia / velocidade;
        if (combustivel >= distancia / autonomia) {
            return tempo;
        } else {
            return 0;
        }
    }
}
