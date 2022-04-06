package aula9_livros;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    //metodos publicos
    public void detalhes(){
        if (this.getAberto()) {
            System.out.println("Título: "+this.getTitulo());
            System.out.println("Autor: "+this.getAutor());
            System.out.println("Total de páginas: "+this.getTotPaginas());
            System.out.println("O leitor "+this.leitor.getNome()+" está lendo na página atual: "+this.getPagAtual());
        }else{
            System.out.println("Livro fechado, detalhes indisponíveis!");
        }

    }
    
    //metodos abstratos da interface
    @Override
    public void abrir() {
        if (this.getAberto()) {
            System.out.println("O Livro já está aberto");
        }else{
            this.setAberto(true);
            System.out.println("Pronto, livro agora está aberto!");
        }
    }

    @Override
    public void fechar() {
        if (this.getAberto()) {
            this.setAberto(false);
            System.out.println("Pronto, livro agora está fechado!");
        }else{
            System.out.println("O livro já está fechado!");
        }

    }

    @Override
    public void folhear(int p) {
        if (this.getAberto()) {
            if (p < this.getTotPaginas() && p > 0) {
                System.out.println("Vamos folhear "+p+" páginas, de página em página!");
                for (int i=0; i < p ; i++) {
                    this.setPagAtual(this.getPagAtual() + 1);
                    System.out.println("Pág: "+this.getPagAtual());
                }
            }else{
                System.out.println("Não tem tantas páginas assim!");
            }
        }else{
            System.out.println("Abra o livro para folhear as páginas");
        }
    }

    @Override
    public void avancarPag() {
        if (this.getAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Página avançada!");
        }else{
            System.out.println("Abra o livro para avançar a página!");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()) {
            this.setPagAtual(this.getPagAtual() -  1);
            System.out.println("Voltamos para página anterior!");
        }else{
            System.out.println("Abra o livro para recuar a página!");
        }
    }
    
    //construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setLeitor(leitor);
        this.setPagAtual(0);
        this.setAberto(false);
    }
    
    //metodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String livro) {
        this.titulo = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
