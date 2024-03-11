package aula11;

public class Tecnico extends Aluno {
    @SuppressWarnings("unused")
    private int registroProfissional;

    public void patricar(){
        System.out.println(this.getNome()+"praticou!");
    }
}
