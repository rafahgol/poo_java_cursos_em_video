package aula5;


public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public ContaBanco(){
        setStatus(false);
        setSaldo(0);
    }


    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }


    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }


    public void AbrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo()== "CC"){
            this.setSaldo(50);
        }
        if(this.getTipo()=="CP"){
            this.setSaldo(150);;
        }

        System.out.println("Conta aberta com sucesso!");
    }


    public void FecharConta(){
        if(this.getSaldo()>0){
            System.out.println("ERRO! Necessário saldo da conta 0.");
        }
        else if(this.getSaldo()<0){
            System.out.println("ERRO! Conta com saldo negativo.");
        }
        else{
            this.setStatus(false);
        }

    }


    public void Depositar(float deposito){
        if(this.isStatus()==true){
            this.setSaldo(this.getSaldo()+deposito);
        }
        else{
            System.out.println("Impossível depositar.");
        }
    }

    
    public void Sacar(float saque){
        if (this.isStatus()==true){
            if(saque>this.getSaldo()){
                System.out.println("ERRO! Valor de saque maior que saldo da conta.");
            }
            else{
                this.setSaldo(this.getSaldo()-saque);
                System.out.println("SAQUE FEITO! Saldo da conta após saque:" + this.saldo);
            }
        }
    }


    public void pagarMensal(){

        if(this.isStatus()==true)
        {
            if(this.getTipo()=="CC"){
                this.setSaldo(this.getSaldo()-12);
            }
            else {
                this.setSaldo(this.getSaldo()-20);;
            }
        }
    }

    public void estadoAtual(){
        System.out.println("Número da conta:"+ this.getNumConta());
        System.out.println("Tipo da conta:"+ this.getTipo());
        System.out.println("Dono da conta:"+this.getDono());
        System.out.println("Saldo da conta:"+ this.getSaldo());
        System.out.println("Satus da conta:"+this.isStatus());
        System.out.println("=======================================");
    }
}
