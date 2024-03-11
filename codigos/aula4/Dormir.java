package aula4;

public class Dormir {
    Boolean luz_apagada, dentes_escovados, bebeu_agua, cheiroso, ventilador_ligado, esta_com_dor;
    Float temperatura_quarto;

    void desligar_luz()
    {
        this.luz_apagada = true;
    }
    
    void acender_luz()
    {
        this.luz_apagada = false;
    }

    void beber_agua()
    {
        this.bebeu_agua = true;
    }

    void escovar_dente()
    {
        this.dentes_escovados = true;
    }

    void passar_perfume()
    {
        this.cheiroso = true;
    }

    void desligar_ventilador()
    {
        this.ventilador_ligado = false;
    }
    
    void ligar_ventilador()
    {
        this.ventilador_ligado = true;
    }

    void dor_visicula()
    {
        this.esta_com_dor = true;
    }

    void ajusta_temperatura(float temperatura)
    {
        this.temperatura_quarto = temperatura;
    }

    void checa_dorme()
    {
        if((this.bebeu_agua == true) & (this.dentes_escovados==true)&(this.luz_apagada==true)
        & (this.temperatura_quarto>=16)&(this.temperatura_quarto<38))
        {
            System.out.println("Hmm gostosin bora dormir!");
        }
        if(this.luz_apagada==false)
        {
            System.out.println("APAGA A LUZ AI VEI PELO AMOR DE DEUS");
        }
        if(this.esta_com_dor==true)
        {
            System.out.println("Dor dor dor. Um dia vai melhorar Rafael. Tenha fé.");
        }

        if(this.temperatura_quarto>38)
        {
            System.out.println("TA CALOR PRA CARRRRR Q ISSO VAMO DORMIR NÃO ZÉ.");
        }
        if(this.dentes_escovados==false)
        {
            System.out.println("Vai escovar os dente desgraça");
        }

        if(this.ventilador_ligado==false)
        {
            System.out.println("Coe mano barulhin do ventilador gostosin liga ai pfv");
        }
    }
}
