package atividades;
import java.util.Scanner;
public class Atividade_6 {
    static void main(String[] args) {
        int n1;
        int n2;
        int aux;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundoo número: ");
        n2 = entrada.nextInt();

        aux = n1;
        n1 = n2;

        System.out.println("O n1 agora vale "+n2+" e o n2 vale "+ aux);
    }
}
