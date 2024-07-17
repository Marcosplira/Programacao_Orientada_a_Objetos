package Aulas20;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(25, 9, 2023);
        Data data2 = new Data(25, 9, 2023);
        int comparacao = data1.compara(data2);
        System.out.println("Comparação entre as datas: " + comparacao);
        boolean bissexto = data1.isBissexto();
        System.out.println("O ano é bissexto? " + bissexto);
        String mesExtenso = data1.getMesExtenso();
        System.out.println("Mês por extenso: " + mesExtenso);
      }
}
