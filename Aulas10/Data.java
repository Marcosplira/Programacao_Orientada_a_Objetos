package Aulas10;

public class Data {
    int dia, mes, ano;

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }
  public Data() {
    dia = 01;
    mes = 01;
    ano = 1990;
  }
  void escreverAData() {
    System.out.println(dia+"/"+mes+"/"+ano);
  }

  void escreverOMes() {
    switch(mes) {
      case 1:
        System.out.println("Janeiro");
        break;
      case 2:
        System.out.println("Fevereiro");
        break;
      case 3:
        System.out.println("Março");
        break;
      case 4:
        System.out.println("Abril");
        break;
      case 5:
        System.out.println("Maio");
        break;
      case 6:
        System.out.println("Junho");
        break;
      case 7:
        System.out.println("Julho");
        break;
      case 8:
        System.out.println("Agosto");
        break;
      case 9:
        System.out.println("Setembro");
        break;
      case 10:
        System.out.println("Outubro");
        break;
      case 11:
        System.out.println("Novembro");
        break;
      case 12:
        System.out.println("Dezembro");
        break;
    }
  }

  void setData(String data) {
    this.dia = Integer.parseInt( data.substring(0, 2) );
    // 0 1 2 3 4 5 678910
    // 0 6 / 0 3 / 2 0 2 4
    this.mes = Integer.parseInt( data.substring(3, 5) );
    this.ano = Integer.parseInt( data.substring(6, 10) );
  }
}
