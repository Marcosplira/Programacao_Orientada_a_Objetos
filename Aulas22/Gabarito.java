package Aulas22;
import java.util.List;
public class Gabarito {
    private List<String> respostasCorretas;
    private boolean finalizada;
    public Gabarito(List<String> respostasCorretas) {
        this.respostasCorretas = respostasCorretas;
        this.finalizada = false;
    }
    public String resposta(int numeroQuestao) {
        if (!finalizada) {
            return respostasCorretas.get(numeroQuestao);
        } else {
            return "Prova finalizada, não é possível visualizar respostas.";
        }
    }
    public void finalizar() {
        this.finalizada = true;
    }
    public int acertos(List<String> respostasAluno) {
        int count = 0;
        for (int i = 0; i < respostasCorretas.size(); i++) {
            if (respostasCorretas.get(i).equals(respostasAluno.get(i))) {
                count++;
            }
        }
        return count;
    }
    public double nota(List<String> respostasAluno) {
        double nota = 0.0;
        for (int i = 0; i < 10; i++) {
            if (respostasCorretas.get(i).equals(respostasAluno.get(i))) {
                nota += 0.5;
            }
        }
        for (int i = 10; i < 15; i++) {
            if (respostasCorretas.get(i).equals(respostasAluno.get(i))) {
                nota += 1.0;
            }
        }
        return nota;
    }
}
