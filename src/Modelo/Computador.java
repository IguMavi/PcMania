package Modelo;

public class Computador {

    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marcaParam, float precoParam,
                      HardwareBasico[] hardwaresParam,
                      SistemaOperacional sistemaOperacionalParam,
                      MemoriaUSB memoriaUSBParam) {

        marca = marcaParam;
        preco = precoParam;
        hardwares = hardwaresParam;
        sistemaOperacional = sistemaOperacionalParam;
        memoriaUSB = memoriaUSBParam;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);

        for (int i = 0; i < hardwares.length; i++) {
            if (hardwares[i] != null) {
                System.out.println(hardwares[i].getNome() + ": " + hardwares[i].getCapacidade());
            }
        }

        System.out.println("SO: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");

        if (memoriaUSB != null) {
            System.out.println("USB: " + memoriaUSB.getNome() + " - " + memoriaUSB.getCapacidade() + "GB");
        }

        System.out.println("----------------------");
    }

    public void addMemoriaUSB(MemoriaUSB musbParam) {
        memoriaUSB = musbParam;
    }
}