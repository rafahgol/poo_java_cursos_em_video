package aula6;

public class Controle implements Controlador{
    private int volume,mudo_volume;
    private boolean ligado, tocando;


    public Controle(){
        volume = 50;
        ligado = false;
        tocando = false;
    }


    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }


    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


    public boolean isTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    public int getMudo_volume() {
        return mudo_volume;
    }
    public void setMudo_volume(int mudo_volume) {
        this.mudo_volume = mudo_volume;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }


    @Override
    public void desligar() {
        this.setLigado(false);
    }


    @Override
    public void abrirMenu() {
        if(this.isLigado()){
            System.out.println("Está ligado?:"+this.isLigado());
            System.out.println("Está tocando?:"+ this.isTocando());
            System.out.println("Volume:"+ this.getVolume());
            for (int i=0;i <= this.getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println();
        }

    }


    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu....");
    }


    @Override
    public void maisVolume() {
        if(this.isLigado()){
        this.setVolume(this.getVolume()+5);
        }
    }


    @Override
    public void menosVolume() {
        if(this.isLigado()){
        this.setVolume(this.getVolume()-5);
        }
    }


    @Override
    public void ligarMudo() {
        if((this.isLigado())&&(this.getVolume()!=0)){
        setMudo_volume(getVolume());
        this.setVolume(0);
        }
    }


    @Override
    public void desligarMudo() {
        if((this.isLigado())&&(this.getVolume()==0)){
        this.setVolume(getMudo_volume());
        }
    }


    @Override
    public void play() {
        if((this.isLigado())&&(this.isTocando()==false)){
            this.setTocando(true);
        }
    }


    @Override
    public void pause() {
        if((this.isLigado())&&(this.isTocando())){
            this.setTocando(false);
        }
    }


    
}
