package aula8;

public class Lutador {
    //Atribbutes
    private String nome, nacionalidade,categoria;
    private int idade, vitorias,derrotas,empates;
    private float altura,peso;


    //Constructor
 public Lutador(String nome, String nacionalidade, int idade, float altura, 
                int vitorias, int derrotas, int empates, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.setPeso(peso); 
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso()<52.2){
            this.categoria="Inválido";
        }
        else if(this.getPeso()<=70.3){
            this.categoria="Leve";
        }
        else if(this.getPeso()<=83.9){
            this.categoria="Medio";
        }
        else if(this.getPeso()<=120.2){
            this.categoria="Pesado";
        }
        else{
            this.categoria="Inválido";
        }
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }


    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }


    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }


    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    public void apresentar(){
        System.out.println("---------------------------------------------");
        System.out.println("CHEGOU A HORA!! Apresentamos o lutador:"+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("com "+this.getIdade()+" anos de idade e "+getAltura()+"m de altura.");
        System.out.println("Pesando "+this.getPeso()+"KG");
        System.out.println("Ganhou:"+this.getVitorias());
        System.out.println("Perdeu:"+this.getDerrotas());
        System.out.println("Empatou:"+this.getEmpates());
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("é um peso "+ this.getCategoria());
        System.out.println(this.getVitorias()+"vitorias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);      
    }
}
