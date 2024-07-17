package Revisao3;

public class Livro {
  private Capitulo[] capitulos;
  private String nome;


  public Livro(int qtdCapitulos){
    capitulos = new Capitulo[qtdCapitulos];

    for(int i = 0; i < qtdCapitulos; i++){
      capitulos[i] = new Capitulo();
      capitulos[i].setTitulo("Titulo " + i);
    }
  }
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public Capitulo[] getCapitulos(){
    return capitulos;
  }

  public String getTituloCapitulo(int numero){
    return capitulos[numero].getTitulo();
  }

  public String getTitulosCapitulos(){
    String titulos = "";
    for(int i = 0; i < capitulos.length; i++){
      titulos += "Titulo " + i + ": " + capitulos[i].getTitulo() + "\n";
    }
    return titulos; 
  }
}
