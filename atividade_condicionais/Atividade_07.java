package atividade_condicionais;

import java.util.Scanner;

public class Atividade_07 {
    static void main(String[] args) {
        int num;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é par ou ímpar");
        num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }
    }
}
