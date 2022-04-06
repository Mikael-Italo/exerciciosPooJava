package aula12polimorfismo;

public class Ave extends Animal{
    //atributo para especialização
    protected String corPena;
    //metodo para especialização
    public void fazerNinho(){
        System.out.println("Está fazendo um ninho");
    }
    //metodos abstratos herdados da "mãe"(superclasse) para implementação
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Ciscando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Canto de ave");
    }
    
    
    //metodos especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
