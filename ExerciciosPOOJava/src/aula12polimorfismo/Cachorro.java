package aula12polimorfismo;

public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Enterrando o osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
}
