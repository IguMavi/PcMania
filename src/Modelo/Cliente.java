package Modelo;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] computadores;

    public Cliente(String nome, String cpf, Computador[] computadores) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = computadores;
    }

    public void addComputador(Computador pc, int posicao) {
        computadores[posicao] = pc;
    }

    public float calculaTotalCompra() {
        float total = 0;

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }

        return total;
    }

    public void mostraCompras() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                computadores[i].mostraPCConfigs();
            }
        }

        System.out.println("Total: R$" + calculaTotalCompra());
    }

    public Computador[] getComputadores() {
        return computadores;
    }
}