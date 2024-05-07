package challenge1;
import java.util.ArrayList;
import java.util.List;

class Candidato {
    private int id;
    private String nome;
    private double salario;

    public Candidato(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: " + salario;
    }
}