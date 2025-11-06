package teste_poo;

public class Caneta {
    /* ------------------------- Definição dos atributos ------------------------*/
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    /*-------------------------- Criação de métodos ----------------------------*/

    void rabiscar(){
        if(this.tampada == true ){
            System.out.println("Erro! Você está com a caneta tampada, e não pode rabiscar 😡");
        } else if (this.carga < 1) {
            System.out.println("Erro! Voê não tem carga na caneta para rabiscar! ✒️ ❌");
        } else {
            System.out.println("Caneta destampada e com carga! Pode rabiscar! 😊");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }

    /*-------------------------- Definição do estado atual -----------------------*/

    void estado(){
        System.out.println("Esta caneta é do modelo: " + this.modelo);
        System.out.println("Esta caneta tem a cor: " + this.cor);
        System.out.println("Esta caneta está com a carga em: " + this.carga + "%");
        System.out.println("Esta caneta tem a ponta:  " + this.ponta);
        System.out.println("Esta caneta está tampada? " + this.tampada);
    }

    void desenhar(){
        if(this.tampada == true){
            System.out.println("Erro! Você está com a caneta tampada, e não pode desenharr 😭");
        } else if (this.carga < 1) {
            System.out.println("Erro! Voê não tem carga na caneta para desenhar! 🖼️❌");
        } else {
            System.out.println("Caneta destampada! Pode desenhar! 🖼️🎨🧑‍🎨");
        }
    }

}
