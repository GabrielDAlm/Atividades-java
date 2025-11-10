package atividade_condicionais;

import java.util.Scanner;

public class Atividade_03 {
    static void main(String[] args) {
        double saldo_medio;
        double credito;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do saldo médio: ");
        saldo_medio = entrada.nextDouble();

        if ((saldo_medio >= 0) && (saldo_medio <= 500)) {
            System.out.println("O valor inserido foi: " + saldo_medio + " Sem valor de crédito!");
        } else if ((saldo_medio > 500) && (saldo_medio <= 1000)) {
            credito = saldo_medio * 0.3;
            System.out.println("O valor do saldo médio é de: " + saldo_medio + "   30% de crédito é igual à : " + credito);
        } else if ((saldo_medio > 1000) && (saldo_medio <= 3000)) {
            credito = saldo_medio * 0.4;
            System.out.println("O valor do saldo médio é de: " + saldo_medio + "   40% de crédito é igual à : " + credito);
        } else if (saldo_medio > 3000) {
            credito = saldo_medio * 0.5;
            System.out.println("O valor do saldo médio é de: " + saldo_medio + "   50% de crédito é igual à : " + credito);
        } else {
            System.out.println("ERRO! Digite um valor maior que zero");
        }

    }
}
