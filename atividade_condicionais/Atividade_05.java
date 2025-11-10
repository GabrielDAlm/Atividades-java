package atividade_condicionais;

import java.util.Scanner;

public class Atividade_05 {
    static void main(String[] args) {
        int prato;
        int sobremesa;
        int bebida;

        int caloria_prato = 0;
        int caloria_sobremesa = 0;
        int caloria_bebida = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha o prato: Digite 1 para vegetariano, 2 para peixe, 3 para frango ou 4 para carne:");
        prato = entrada.nextInt();
        System.out.println("Escolha a sobremesa: Digite 1 para abacaxi, 2 para sorvete diet 3 para mousse diet ou 4 para mousse chocolate: ");
        sobremesa = entrada.nextInt();
        System.out.println("Escolha a bebida: Digite 1 para chá, 2 para suco de laranja, 3 para suco de melão ou 4 para refrigerante diet:");
        bebida = entrada.nextInt();

        switch (prato) {
            case 1: caloria_prato = 180; break;
            case 2: caloria_prato = 230; break;
            case 3: caloria_prato = 250; break;
            case 4: caloria_prato = 350; break;
            default:
                System.out.println("ERRO! Número de prato inválido!");
        }
        switch (sobremesa) {
            case 1: caloria_sobremesa = 75; break;
            case 2: caloria_sobremesa = 110; break;
            case 3: caloria_sobremesa = 170; break;
            case 4: caloria_sobremesa = 200; break;
            default:
                System.out.println("ERRO! Número de sobremesa inválido!");
        }
        switch (bebida) {
            case 1: caloria_bebida = 20; break;
            case 2: caloria_bebida = 70; break;
            case 3: caloria_bebida = 100; break;
            case 4: caloria_bebida = 65; break;
            default:
                System.out.println("ERRO! Número de bebida inválido!");
        }

        int caloria_total;
        caloria_total = caloria_prato + caloria_sobremesa + caloria_bebida;

        System.out.println("A quantidade total de calorias da sua refeição é de: "+caloria_total+" cal");

    }
}
