package Aulas10;

public class Main {
    public static void main(String[] args) {
      Data data = new Data(01, 10, 2024);
      data.escreverAData();
      data.escreverOMes();
  
      Data hoje = new Data(01, 01, 2024);
      hoje.escreverAData();
      hoje.setData("06/03/2024");
      hoje.escreverAData();
      
      Data natal = new Data(25, 12, 2024);
      natal.escreverAData();
  
      Data aniversario = new Data();
      aniversario.setData("24/07/2003");
      aniversario.escreverAData();
    }
  }