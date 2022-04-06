package aula12polimorfismo;

public class Reptil extends Animal{
    //atributo de especialização
    protected String corEscama;
    
    //metodos abstratos para sobreposição
    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    
    //metodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
