package Modelo;

public class HardwareBasico {
    private String nome;
    private int capacidade;

    public HardwareBasico(String nomeParam, int capacidadeParam) {
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
