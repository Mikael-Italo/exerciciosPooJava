package projetofinal;

public class Visualizacao {
    //atributos para agregação
    private Gafanhoto espectador;
    private Video filme;

    //construtor

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.viuMaisUm();
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    
    //metodos publicos sobrecarregados
    public void avaliar(){
        this.filme.setAvaliacao(1);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
    int nota = 0; 
        if (porc <= 25) {
            nota = 3;
        }else if (porc <= 50) {
            nota = 5;
        }else if (porc <= 75) {
            nota = 7;
        }else if (porc <= 90) {
            nota = 9;
        }else{
            nota = 10;
        }
        this.filme.setAvaliacao(nota);
    }
    
    
    //metodos especiais
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ","
                + " filme= " + filme + '}';
    }
    
    
    
}
