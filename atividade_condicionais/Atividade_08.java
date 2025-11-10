package atividade_condicionais;

import java.util.Scanner;

public class Atividade_08 {
    static void main(String[] args) {
        int A;
        int B;
        int C;
        int aux;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        A = entrada.nextInt();
        System.out.println("Digite o segundo número");
        B = entrada.nextInt();
        System.out.println("Digite o terceiro número");
        C = entrada.nextInt();

        if ((A >= B) && (A >= C)) {
            if (B >= C) {
                System.out.println(A+" "+B+" "+C);
            } else {
                System.out.println(A+" "+C+" "+B);
            }
        } else if ((B >= A) && (B >= C)) {
            if (A >= C) {
                System.out.println(B+" "+A+" "+C);
            } else {
                System.out.println(B+" "+C+" "+A);
            }
        } else if (C >= A) {
            if (A >= B) {
                System.out.println(C+" "+A+" "+B);
            } else {
                System.out.println(C+" "+B+" "+A);
            }
        }
    }
}
