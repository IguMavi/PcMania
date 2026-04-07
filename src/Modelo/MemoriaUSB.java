package Modelo;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nomeParam, int capacidadeParam) {
        nome = nomeParam;
        capacidade = capacidadeParam;
    }
    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
