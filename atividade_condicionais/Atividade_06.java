package atividade_condicionais;

import java.util.Scanner;

public class Atividade_06 {
    static void main(String[] args) {
        int dia;
        String nome_dia = "Inválido";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7 para o dia da semana:");
        dia = entrada.nextInt();

        switch (dia) {
            case 1: nome_dia = "Domingo"; break;
            case 2: nome_dia = "Segunda-Feira"; break;
            case 3: nome_dia = "Terça-Feira"; break;
            case 4: nome_dia = "Quarta-Feira"; break;
            case 5: nome_dia = "Quinta-Feira"; break;
            case 6: nome_dia = "Sexta_Feira"; break;
            case 7: nome_dia = "Sábado"; break;
            default:
                System.out.println("ERRO! Número inexistente");
        }

        System.out.println("O dia da semana é: " + nome_dia);
    }
}
