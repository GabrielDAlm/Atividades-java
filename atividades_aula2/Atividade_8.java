package atividades;

import java.util.Scanner;

public class Atividade_8 {
    static void main(String[] args) {
        int num;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número: ");
        num = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mult = num * i;
            System.out.println(num+" X "+i+" = "+mult);
        }

    }
}
