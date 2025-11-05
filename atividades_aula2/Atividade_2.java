package atividades;
import java.util.Scanner;

public class Atividade_2 {
    static void main(String[] args) {
        float raio;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio do círculo");
        raio = entrada.nextFloat();

        double area = 3.14*(raio*raio);
        double peri = 2*3.14*raio;

        System.out.printf("Area = %.2f\n", area);
        System.out.printf("Perimetro = %.2f\n", peri);
    }
}
