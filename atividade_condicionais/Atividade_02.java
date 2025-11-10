package atividade_condicionais;

import java.util.Scanner;

public class Atividade_02 {
    static void main(String[] args) {
        float altura;
        float peso;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        altura = entrada.nextFloat();

        System.out.println("Digite seu peso: ");
        peso = entrada.nextFloat();

        float imc = peso/(altura * altura);

        System.out.printf("Seu IMC é igual a: %.2f", imc);

        if (imc <= 18.5) {
            System.out.println("Você está abaixo do peso!");
        } else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.println("Você está no peso ideal!");
        } else if ((imc >= 25) && (imc <= 29.9)) {
            System.out.println("Você está levemente acima do peso!");
        } else if ((imc >= 30) && (imc <= 34.9)) {
            System.out.println("Você está com obesidade grau 1");
        } else if ((imc >= 35) && (imc <= 39.9)) {
            System.out.println("Você está com obesidade grau 2!");
        } else {
            System.out.println("Você está com obesidade mórbida");
        }
    }
}
