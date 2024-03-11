package aula14;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    



    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }

    ///Methods
    public void viuMaisUm(){
        this.totAssistido++;
    }


    ///Getters and Setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }


    @Override
    public String toString() {
        return "Gafanhoto ["+ super.toString()+"\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
    }
    
    
}