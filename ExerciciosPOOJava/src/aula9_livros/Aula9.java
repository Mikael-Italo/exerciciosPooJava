package aula9_livros;

public class Aula9 {

  
    public static void main(String[] args) {
        Pessoa[] p1 = new Pessoa[2];
        Livro[] l1 = new Livro[2];
        
        //Criando pessoas
        p1[0] = new Pessoa("Mikael", 24, "m");
        p1[1] = new Pessoa("Lidiane", 26, "f");
        
        //Criando livros
        l1[0] = new Livro("Java", "Michele Arantes", 347, p1[0]);
        l1[1] = new Livro("JavaDoc", "Marcelle Godooi", 580, p1[1]);
        
        //Alguns metodos de livro!
        l1[1].abrir();
        l1[1].folhear(12);
        l1[1].avancarPag();
        l1[1].detalhes();
        
        //Fique a vontade, divirta-se!
        
    }
    
}
