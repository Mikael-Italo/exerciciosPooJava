package aula12polimorfismo;

public class Mamifero extends Animal{
    //atributo de especialização
    protected String corPelo;
    
    //metodos abstratos herdados da mãe, vamos implementar
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
    //metodos especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
