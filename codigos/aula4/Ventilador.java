package aula4;

public class Ventilador {
    Boolean ligado, limpo;
    int velocidade;

    void mudar_velocidade(int veloct)
    {
       if(this.ligado==true)
       {
        this.velocidade = veloct;
       }
       else
       {
        System.out.println("Ta desligado paizão.");
       }
    }

    void ligar()
    {
        this.ligado = true;
    }

    void desligar()
    {
        this.ligado = false;
    }

    void limpar()
    {
        if(this.ligado==true)
        {
            System.out.println("AAAAAII CORTEI A MÃO");
        }
        else
        {
            this.limpo = true;
        }
    }
}
