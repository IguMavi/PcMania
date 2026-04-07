package Controle;

import java.util.Scanner;
import Modelo.*;

public class Loja {

    private Computador[] estoque;

    public Loja() {
        estoque = new Computador[3];
        inicializaEstoque();
    }

    private void inicializaEstoque() {

        int matricula = 663;

        HardwareBasico[] hw1 = new HardwareBasico[3];
        hw1[0] = new HardwareBasico("i3", 2200);
        hw1[1] = new HardwareBasico("RAM", 8);
        hw1[2] = new HardwareBasico("HD", 500);

        estoque[0] = new Computador("Apple", matricula, hw1,
                new SistemaOperacional("macOS Sequoia", 64),
                new MemoriaUSB("Pen-drive", 16));

        HardwareBasico[] hw2 = new HardwareBasico[3];
        hw2[0] = new HardwareBasico("i5", 3370);
        hw2[1] = new HardwareBasico("RAM", 16);
        hw2[2] = new HardwareBasico("HD", 1000);

        estoque[1] = new Computador("Samsung", matricula+1234, hw2,
                new SistemaOperacional("Windows 8", 64),
                new MemoriaUSB("Pen-drive", 32));

        HardwareBasico[] hw3 = new HardwareBasico[3];
        hw3[0] = new HardwareBasico("i7", 4500);
        hw3[1] = new HardwareBasico("RAM", 32);
        hw3[2] = new HardwareBasico("HD", 2000);

        estoque[2] = new Computador("Dell", matricula+5678, hw3,
                new SistemaOperacional("Windows 10", 64),
                new MemoriaUSB("HD Externo", 1000));
    }

    public void realizarCompra(Cliente cliente) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        int index = 0;

        do {
            System.out.println("\n1 - Apple");
            System.out.println("2 - Samsung");
            System.out.println("3 - Dell");
            System.out.println("0 - Finalizar");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                if (index < cliente.getComputadores().length) {
                    cliente.addComputador(estoque[opcao - 1], index++);
                }
            }

        } while (opcao != 0);

        cliente.mostraCompras();
        ProcessarPedido.processar(cliente.getComputadores());

        sc.close();
    }
}