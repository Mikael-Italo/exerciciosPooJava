package projetofinal;

public class Video implements AcoesVideos{
//atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //Construtor de video
    public Video(String titulo){
        this.setTitulo(titulo);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    
//metodos publicos

    @Override
    public String toString() {
        return "Video:"
                + " {" + "titulo= " + titulo + ","
                + " avaliacao= " + avaliacao + ","
                + " views= " + views + ","
                + " curtidas= " + curtidas + ","
                + " reproduzindo= " + reproduzindo + '}';
    }
    
    
    
//metodos abstratos da interface
    @Override
    public void play() {
        if (reproduzindo) {
            System.out.println("Já está reproduzindo");
        } else {
            System.out.println("Pronto, agora está Play");
        }
    }

    @Override
    public void pause() {
        if (reproduzindo) {
            System.out.println("Pronto, Pause no vídeo");
        } else {
            System.out.println("Video já esta pausado");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }


//metodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova =(int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
}
