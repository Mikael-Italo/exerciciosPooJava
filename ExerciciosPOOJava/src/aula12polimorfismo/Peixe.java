package aula12polimorfismo;

public class Peixe extends Animal{
    //atributo para especialização
    protected String corEscama;
    
    //metodos para especialização
    public void fazerBolha(){
        System.out.println("Está soltando bolhas");
    }
    
    //metodos abstratos herdados para implementação
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer substâncias da água");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não tem som");
    }
    
    //metodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
