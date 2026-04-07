package Main;

import Modelo.*;
import Controle.Loja;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Igor",
                "8363927444",
                new Computador[10]
        );

        Loja loja = new Loja();
        loja.realizarCompra(cliente);
    }
}