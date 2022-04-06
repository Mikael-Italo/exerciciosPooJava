package aula9_livros;
public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;

    
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
    
    
    //construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome); 
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    
    
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
    
    
}
