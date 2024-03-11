package aula2;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    
    void rabiscar(){
        if (this.tampada==true){
            System.out.println("ERRO! Caneta tampada");
        }
        else
        {
            System.out.println("Rabissssssquei");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void status(){
        System.out.println("-----------------------------------------");
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Carga da caneta:"+this.carga);
        System.out.println("Modelo da caneta:"+this.modelo);
        System.out.println("Ponta da caneta:"+this.ponta);
        System.out.println("A caneta está tampada?:"+this.tampada);
        System.out.println("-----------------------------------------");
    }
}