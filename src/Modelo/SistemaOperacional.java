package Modelo;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nomeParam, int tipoParam) {
        nome = nomeParam;
        tipo = tipoParam;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
