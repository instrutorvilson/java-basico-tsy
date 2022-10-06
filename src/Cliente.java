import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Cliente {
    private String nome;
    private HashSet<Carro> carros = new HashSet<>();

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashSet<Carro> getCarros() {
        return carros;
    }

    public boolean addCarro(Carro c){
        carros.add(c);
        return  true;
    }

    public void display(){
        System.out.println("Nome: " + this.nome);
    }

}
