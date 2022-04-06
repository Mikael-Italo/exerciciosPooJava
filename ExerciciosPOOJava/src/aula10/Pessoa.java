package aula10;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //metodos publicos
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }
    
    protected void ficha(){
        System.out.println("======Dados=====");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        if (this.getSexo().equals("m")) {
            System.out.println("Sexo: masculino");
        }else{
            System.out.println("Sexo: feminino");
        }
        
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
