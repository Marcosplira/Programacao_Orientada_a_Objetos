package Aulas21;
import java.util.Date;
public class Voo {
    private Date data;
    private String horario;
    private int numeroVoo;
    private int capacidadePassageiros;
    private boolean[] assentosOcupados;
    public Voo(Date data, String horario, int numeroVoo, int capacidadePassageiros) {
        this.data = data;
        this.horario = horario;
        this.numeroVoo = numeroVoo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.assentosOcupados = new boolean[capacidadePassageiros];
    }
    public int proximoLivre() {
        for (int i = 0; i < capacidadePassageiros; i++) {
            if (!assentosOcupados[i]) {
                return i + 1;
            }
        }
        return -1;
    }
    public boolean verifica(int numeroCadeira) {
        return assentosOcupados[numeroCadeira - 1];
    }
    public void ocupa(int numeroCadeira) {
        if (!assentosOcupados[numeroCadeira - 1]) {
            assentosOcupados[numeroCadeira - 1] = true;
            System.out.println("Assento " + numeroCadeira + " ocupado com sucesso.");
        } else {
            System.out.println("Assento " + numeroCadeira + " já está ocupado.");
        }
    }
    public int vagas() {
        int count = 0;
        for (boolean assento : assentosOcupados) {
            if (!assento) {
                count++;
            }
        }
        return count;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public int getNumeroVoo() {
        return numeroVoo;
    }
    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
