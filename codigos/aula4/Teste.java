package aula4;

public class Teste {
    public static void main(String[] args) {
        Dormir mimir = new Dormir();
        mimir.bebeu_agua = true;
        mimir.cheiroso = false;
        mimir.dentes_escovados= false;
        mimir.esta_com_dor= false;
        mimir.luz_apagada = false;
        mimir.temperatura_quarto = 19.5f;
        mimir.ventilador_ligado = false;
        mimir.checa_dorme();
        System.out.println("=======================================");
        mimir.ventilador_ligado=true;
        mimir.dentes_escovados=true;
        mimir.luz_apagada=true;
        mimir.checa_dorme();
    }
}
