package aula9;

public class Livro implements Publicacao {

    private String titulo,autor;
    private int total_paginas,pag_atual;
    private boolean aberto;
    private Pessoa leitor;
    public Livro(String titulo, String autor, Pessoa leitor, int total_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.total_paginas = total_paginas;
    }
    
    //////////////////////
    ///Getters and Setters
    /////////////////////

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getTotal_paginas() {
        return total_paginas;
    }
    public void setTotal_paginas(int total_paginas) {
        this.total_paginas = total_paginas;
    }


    public int getPag_atual() {
        return pag_atual;
    }
    public void setPag_atual(int pag_atual) {
        this.pag_atual = pag_atual;
    }


    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    //////////////////////
    ///Methods
    /////////////////////
    
    public void detalhes(){
        System.out.println("Titulo do livro:"+this.getTitulo());
        System.out.println("Autor do livro:"+this.getAutor());
        System.out.println("Total de páginas:"+this.getTotal_paginas());
        System.out.println("O livro está aberto?:"+this.aberto);
        System.out.println("Leitor:"+leitor.getNome());
        System.out.println("Sexo:"+leitor.getSexo());
    }
    
    @Override   
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void folhear(int pagina) {
        this.pag_atual = pagina;
    }

    @Override
    public void avancarPag() {
        this.pag_atual+= 1;
    }

    @Override
    public void voltarPag() {
        this.pag_atual-= 1;
    }
    
}
