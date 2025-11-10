package atividade_condicionais;

import java.util.Scanner;

public class Atividade_01 {
    static void main(String[] args) {
        int num;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é divisível por 10, 5 ou 2: ");
        num = entrada.nextInt();

        if ((num % 10 == 0) || (num % 5 == 0) || (num % 2 == 0)) {
            if (num % 10 == 0) {
                System.out.println("Número é divisivel por 10");
            } else if (num % 5 == 0) {
                System.out.println("Número é divisível por 5");
            } else if (num % 2 == 0) {
                System.out.println("Número é divisível por 2");
            }
        } else {
            System.out.println("Numero não é divisível por 10, 5 ou 2");
        }
    }
}