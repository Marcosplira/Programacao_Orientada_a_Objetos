package Aulas14;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
          empresa.criarFuncionario("João", 1, 1000, "Gerente");
          empresa.criarFuncionario("Maria", 2, 2000, "Analista");
          empresa.criarFuncionario("Pedro", 3, 3000, "Desenvolvedor");
          System.out.println(empresa.quantidadeFuncionarios());
          empresa.criarFuncionario("João", 4000, 200, "Teste");
          System.out.println(empresa.quantidadeFuncionarios());
      
        }
}
