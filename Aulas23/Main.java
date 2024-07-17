package Aulas23;

import Aulas23.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "123456789");
        Consulta consulta1 = new Consulta(cliente1);
        Animal animal1 = new Animal("Rex", "Cachorro", "Vômito e febre");
        Secretaria ana = new Secretaria("Ana", "20241111111111");
        consulta1.adicionarAnimal(animal1);
        System.out.println("Cliente: " + consulta1.cliente.nome);
        System.out.println("Animal: " + consulta1.animais.get(0).nome);
        System.out.println("Sintomas: " + consulta1.animais.get(0).sintomas);
    }
}
