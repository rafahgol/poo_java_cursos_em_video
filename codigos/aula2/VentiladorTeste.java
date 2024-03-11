package aula2;

public class VentiladorTeste {
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();
        vent.ligar();
        vent.limpar();
        vent.desligar();
        vent.mudar_velocidade(3);
        vent.limpar();
        vent.ligar();
        vent.mudar_velocidade(3);
    }
}
