package atividades;
import java.util.Scanner;
public class Atividade_1 {
    static void main(String[] args) {
        int n1;
        int n2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();

        float soma = n1 + n2;
        float sub = n1 - n2;
        float mult = n1 * n2;
        float div = n1/n2;

        System.out.printf("A soma dos números é igual a: %.2f\n", soma);
        System.out.printf("A subtração dos números é igual a: %.2f\n", sub);
        System.out.printf("A multiplicação dos números é igual a: %.2f\n", mult);
        System.out.printf("A divisão dos números é igual a: %.2f", div);
    }
}
