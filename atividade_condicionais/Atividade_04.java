package atividade_condicionais;

import java.util.Scanner;

public class Atividade_04 {
    static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade para saber sua classificação eleitoral! ");
        idade = entrada.nextInt();

        if ((idade >= 16) && (idade < 18) || (idade >= 65)) {
            System.out.println(idade+" Anos voto facultativo");
        } else if ((idade >= 18) && (idade < 65)) {
            System.out.println(idade+" Anos, voto Obrigatório");
        } else {
            System.out.println(idade+" Anos não vota");
        }

    }
}
