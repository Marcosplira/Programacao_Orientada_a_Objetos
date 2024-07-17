package Aulas22;
import java.util.List;
public class Prova {
    private String nome;
    private String matricula;
    private String turma;
    private List<String> respostas;

    public Prova(String nome, String matricula, String turma, List<String> respostas) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
        this.respostas = respostas;
    }

    public List<String> getRespostas() {
        return this.respostas;
    }
}
