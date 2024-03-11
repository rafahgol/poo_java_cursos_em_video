package aula5;
public class mainContaBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.estadoAtual();
        p1.AbrirConta("CC");
        p1.estadoAtual();
        p1.Depositar(300);
        p1.estadoAtual();
        p1.Sacar(200);
        p1.estadoAtual();
        p1.FecharConta();
        p1.Sacar(150);
        p1.estadoAtual();
        p1.FecharConta();
        p1.estadoAtual();
    }
}
