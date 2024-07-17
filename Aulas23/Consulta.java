package Aulas23;
import java.util.ArrayList;
public class Consulta {
    Cliente cliente;
    ArrayList<Animal> animais = new ArrayList<>();

    public Consulta(Cliente cliente) {
        this.cliente = cliente;
    }
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }
}
