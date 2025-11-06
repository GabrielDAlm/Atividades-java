package teste_poo;

import javax.swing.*;

public class TesteCaneta {
    public static void main(String[] args){
        Caneta caneta1 = new Caneta();
        Caneta caneta2 = new Caneta();


        caneta1.modelo = "Esferográfica";
        caneta1.cor = "Verde";
        caneta1.ponta = 0.7f;
        caneta1.carga = 75;
        caneta1.tampar();

        caneta1.estado();
        caneta1.rabiscar();
        caneta1.desenhar();

        /*C^*/
        System.out.println("-------------------------------");
        System.out.println("--------- CANETA 2 ------------");
        System.out.println("-------------------------------");

        caneta2.modelo = "Hiidrografica";
        caneta2.cor = "Jujuba de maçã verde";
        caneta2.ponta = 0.5f;
        caneta2.carga = 0;

        caneta2.destampar();
        caneta2.estado();
        caneta2.rabiscar();
        caneta2.desenhar();
    }
}

