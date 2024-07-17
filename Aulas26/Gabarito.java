package Aulas26;
import java.util.ArrayList;

import Aulas26.Prova;
public class Gabarito {
    public ArrayList<String> respostas = new ArrayList<String>();
  private boolean statusProva = true;
  Prova p;
  double totalAcertos = 0;

  Gabarito(Prova p) {
    respostas.add("B");
    respostas.add("C");
    respostas.add("D");
    respostas.add("A");
    respostas.add("E");

    this.p = p;
  }

  public void receberResposta(String resposta) {

    if (statusProva) {
      p.questoes.add(resposta);
    }
  }

  public void finalizarProva() {
    this.statusProva = false;
  }

  public void acertos() {

    if (p.questoes.get(0) == respostas.get(0)) {
      totalAcertos++;
    }

    if (p.questoes.get(1) == respostas.get(1)) {
      totalAcertos++;
    }

    if (p.questoes.get(2) == respostas.get(2)) {
      totalAcertos++;
    }

    if (p.questoes.get(3) == respostas.get(3)) {
      totalAcertos++;
    }

    if (p.questoes.get(4) == respostas.get(4)) {
      totalAcertos++;
    }
  }

  public double getNota() {
    return totalAcertos;
  }
}
