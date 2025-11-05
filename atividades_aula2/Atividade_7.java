package atividades;
import java.util.Scanner;

public class Atividade_7 {
    static void main(String[] args) {
        double deposito;
        float taxa;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o depósito: ");
        deposito = entrada.nextDouble();
        System.out.println("Digite a taxa: ");
        taxa = entrada.nextFloat();


        double mont = deposito*(Math.pow(1+(taxa / 100),12));

        System.out.printf("O montante é igual a: %.2f", mont);
    }
}
