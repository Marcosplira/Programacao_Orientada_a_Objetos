package Aulas14;
import java.util.ArrayList; 

public class Empresa {
  String nome;
  double Cnpj;
  ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

  public Funcionario criarFuncionario(String nome, double matricula, double salario, String cargo) {
    Funcionario funcionario = new Funcionario();
    funcionario.setNome(nome);
    funcionario.setMatricula(matricula);
    funcionario.setSalario(salario);
    funcionario.setCargo(cargo);
    funcionarios.add(funcionario);
    return funcionario;

  }

  public double quantidadeFuncionarios() {
    return funcionarios.size();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getCnpj() {
    return Cnpj;
  }

  public void setCnpj(double Cnpj) {
    this.Cnpj = Cnpj;
  }
}
