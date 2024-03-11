package aula4;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    
    public Caneta(String modelo, String cor, Float ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }


    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }


    public void escrever(){
       System.out.println("Estou escrevendo!");
    }


    public void rabiscar(){
        if (this.tampada==true){
            System.out.println("ERRO! Caneta tampada");
        }
        else{
            System.out.println("Rabissssssquei");
        }
    }


    public void pintar(){
        System.out.println("Estou pintando :).");
    }


    public void status(){
        System.out.println("-----------------------------------------");
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Carga da caneta:"+this.carga);
        System.out.println("Modelo da caneta:"+this.modelo);
        System.out.println("Ponta da caneta:"+this.ponta);
        System.out.println("A caneta está tampada?:"+this.tampada);
        System.out.println("-----------------------------------------");
    }
}