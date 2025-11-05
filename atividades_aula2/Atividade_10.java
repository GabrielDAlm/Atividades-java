package atividades;
import java.util.Scanner;

public class Atividade_10 {
    static void main(String[] args) {
        double sal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário base: ");
        sal = entrada.nextDouble();

        double salbrut = sal+(sal*0.15);

        System.out.println("O seu salário com aumento: "+salbrut);
    }
}
