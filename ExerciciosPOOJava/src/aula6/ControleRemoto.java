package aula6;

public class ControleRemoto implements Controlador6{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //construtor
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    
    //metodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---------Menu---------");
        System.out.println("Está ligado: "+ this.getLigado());
        System.out.println("Está tocando: "+ this.getTocando());
        System.out.println("Volume: "+ this.getVolume());
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.println("/"); 
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() -  1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()) {
            if (this.getVolume() > 0) {
                this.setVolume(0);
            }else{
                System.out.println("Já está mudo");
            }
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado()) {
            if (this.getVolume() == 0) {
                this.setVolume(50);
            }else{
                System.out.println("Não esta mudo! Volume atual: "+this.getVolume());
            }
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
    

    //get e set
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    
}
