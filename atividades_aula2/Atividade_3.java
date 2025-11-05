package atividades;
import java.util.Scanner;
public class Atividade_3 {
    static void main(String[] args) {
        int base;
        int alt;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base do triângulo: ");
        base = entrada.nextInt();
        System.out.println("Digite a altura do triângulo: ");
        alt = entrada.nextInt();

        float area = (base*alt)/2;

        System.out.printf("A área do triângulo é: %.2f", area);

    }
}
