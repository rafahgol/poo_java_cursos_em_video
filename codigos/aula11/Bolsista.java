package aula11;

public class Bolsista extends Aluno{
    @SuppressWarnings("unused")
    private int bolsa;

    @Override
    public void PagarMensalidade(){
        System.out.println("Bolsista! Não precisa pagar.");
    }
}
