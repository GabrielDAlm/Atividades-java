package atividades;
import java.util.Scanner;

public class Atividade_9 {
    static void main(String[] args) {
        int idade;
        int meses;
        int dias;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Digite os meses: ");
        meses = entrada.nextInt();
        System.out.println("Digite os dias: ");
        dias = entrada.nextInt();


        dias = (meses * 30) + (idade * 365) + dias;


        System.out.println("Você tem "+dias+" dias de vida");

    }
}
