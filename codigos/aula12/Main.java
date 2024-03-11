package aula12;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        m.emitirSom();
        r.emitirSom();
        m.setIdade(34);
        m.setCorPelo("Preto");
        m.setPeso(53.3f);
        System.out.println(m.getCorPelo());
        System.out.println(m.getPeso());
    }

}
