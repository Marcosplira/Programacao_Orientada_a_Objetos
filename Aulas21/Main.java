package Aulas21;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date data = new Date(); 
        String horario = "10:00";
        int numeroVoo = 1234;
        int capacidadePassageiros = 100;
        Voo voo = new Voo(data, horario, numeroVoo, capacidadePassageiros);
        System.out.println("Próxima cadeira livre: " + voo.proximoLivre());
        int cadeiraVerificar = 5;
        System.out.println("A cadeira " + cadeiraVerificar + " está ocupada? " + voo.verifica(cadeiraVerificar));
        int cadeiraOcupar = 10;
        voo.ocupa(cadeiraOcupar);
        System.out.println("Número de vagas: " + voo.vagas());
      }
}
