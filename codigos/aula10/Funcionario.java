package aula10;

public class Funcionario extends Pessoa{
        private String setor;
        private boolean trabalhando;

        public Funcionario(String setor, boolean trabalhando) {
            this.setor = setor;
            this.trabalhando = trabalhando;
        }

        /////////////////////
        //Getters and Setters
        /////////////////////

        public String getSetor() {
            return setor;
        }
        public void setSetor(String setor) {
            this.setor = setor;
        }
        public boolean isTrabalhando() {
            return trabalhando;
        }
        public void setTrabalhando(boolean trabalhando) {
            this.trabalhando = trabalhando;
        }

        /////////////////////
        //Methods
        /////////////////////
    
        public void mudarTrabalho(){
            this.trabalhando =!this.trabalhando;
        }
}
