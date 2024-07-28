package Revisao11;

public class Passaro extends Animal{
    private String tipoDeAsa;
    public Passaro(String nome, String tipoDeAsa) {
      super(nome);
      this.tipoDeAsa = tipoDeAsa;
    }
    public String getTipoDeAsa() {
      return tipoDeAsa;
    }
}
