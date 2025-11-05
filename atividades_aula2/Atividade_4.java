package atividades;
import java.util.Scanner;
public class Atividade_4 {
    static void main(String[] args) {
        int n1;
        int n2;
        int n3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota de 0 a 10: ");
        n1 = entrada.nextInt();
        System.out.println("Digite a segunda nota de 0 a 10: ");
        n2 = entrada.nextInt();
        System.out.println("Digite a segunda nota de 0 a 10: ");
        n3 = entrada.nextInt();

        float media = ((n1*2)+(n2*3)+(n3*5))/10;
        System.out.printf("A média das notas é igual a: %.2f", media);
    }
}
