package aula12polimorfismo;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    //metodos abstratos, para futura implementação e sobreposição
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    //metodos publicos finais
    public final void dados(){
        System.out.println("Peso: "+ this.getPeso());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Membros: "+this.getMembros());
    }

    //metodos especiais
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
            
    
}
