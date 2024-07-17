package Aulas22;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> respostasCorretas = Arrays.asList("A", "B", "C", "D", "E", "A", "B", "C", "D", "E", "A", "B", "C", "D", "E");
        Gabarito gabarito = new Gabarito(respostasCorretas);
        List<String> respostasAluno = Arrays.asList("A", "B", "C", "D", "E", "A", "B", "C", "D", "E", "A", "B", "C", "D", "E");
        Prova prova = new Prova("João", "12345", "Sala A", respostasAluno);
        gabarito.finalizar();
        int numAcertos = gabarito.acertos(prova.getRespostas());
        double nota = gabarito.nota(prova.getRespostas());
        System.out.println("Número de acertos: " + numAcertos);
        System.out.println("Nota do aluno: " + nota);
    }
}
