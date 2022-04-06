package aula7_jogodelutafeitodiferente;

public class Lutador{
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    
    //metodos publicos  
    public void apresentar(){
        System.out.println("-----------------------");
        System.out.println("Lutador: " + this.getNome() + ", diretamente da(e): "+this.getNacionalidade() + ", atualmente está com "+this.getIdade()+" anos!");
        System.out.println("Altura: "+this.getAltura()+"cm, peso: "+this.getPeso()+"kg");
        System.out.println("Categoria: Peso "+this.getCategoria());
        System.out.println("Sua ficha atual, conta com "+this.getVitorias()+" vitórias, "+this.getDerrotas()+" derrotas, "+this.getEmpates()+" empates!");
        System.out.println("--------------------------------------------");
    }
    
    public void status(){
        System.out.println(this.getNome()+": peso "+this.getCategoria());
        System.out.println(this.getVitorias()+ " vitórias");
        System.out.println(this.getDerrotas()+ " derrotas");
        System.out.println(this.getEmpates() + " empates!");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    

//contrutor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    

//getters e setters
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 50) {
            this.categoria = "Inválido, muito abaixo!";
        }else if (this.getPeso() <= 70) {
            this.categoria = "Leve";
        }else if (this.getPeso() <= 83) {
            this.categoria = "Médio";
        }else if (this.getPeso() <= 120) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido, peso muito acima!";
        }
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    } 
}
