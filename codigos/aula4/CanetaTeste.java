package aula4;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        c1.status();
        Caneta c2 = new Caneta("ZAP", "Roxa", 1f);
        c2.setTampada(true);
        c2.status();
    }
}