package Aulas17;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
        candidatos.add(new Candidato("João", 25, 70));
        candidatos.add(new Candidato("Maria", 30, 65));
        Collections.sort(candidatos, Comparator.comparingDouble(Candidato::calcularRitmoCorrida));
        System.out.println("Ordem decrescente de menor tempo para uma corrida de 5km:");
        for (Candidato candidato : candidatos) {
            System.out.println(candidato.getNome() + ": " + candidato.calcularRitmoCorrida());
        }
    }
}
