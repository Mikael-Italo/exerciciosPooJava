package projetofinal;

public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade, xp;

    //construtor
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.xp = 0;
    }
    
    
    //metodo abstrato para implementação na subclasse
    protected abstract void ganharXP();
    
    
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getXp() {
        return xp;
    }

    protected void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Dados:"
                + " {" + "nome=" + nome + ","
                + " sexo=" + sexo + ","
                + " idade=" + idade + ","
                + " xp=" + xp + '}';
    }
    
    
    
}
