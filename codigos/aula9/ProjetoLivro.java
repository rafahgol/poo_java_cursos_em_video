package aula9;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Rafael", "Masculino", 23);
        p[1] = new Pessoa("Shai", "Feminino", 24);

        l[0] = new Livro("Crônicas de Aang", "Bebel",p[0], 150);
        l[1] = new Livro("Caravau", "Leleko", p[1], 153);
        l[2] = new Livro("Cronicas de Gelo e do Fogo", "GGRRMatin", p[0], 353);

        l[0].avancarPag();
        l[0].folhear(35);
        l[0].detalhes();
        l[0].abrir();
        l[0].detalhes();
        l[0].getPag_atual();
    }
}
