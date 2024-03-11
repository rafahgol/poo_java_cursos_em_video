package aula2;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.carga = 90;
        c1.modelo = "Maneirasso";
        c1.ponta = 0.5f;
        c1.tampada = true;

        c1.status();
        c1.rabiscar();

        c1.destampar();
        c1.status();
        c1.rabiscar();
        c1.tampar();
        c1.status();
    }
}