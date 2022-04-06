package projetofinal;

public class Gafanhoto extends Pessoa{
//atributos
    private String login;
    private int totAssistido;

    //construtor criado a partir da superclasse. Pq todo gafanhoto tera que ter os dados de pessoa
    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.setLogin(login);
        this.totAssistido = 0;
    }
    
    
    //metodos publicos de especialização
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
    
    //metodos abstratos para implementação da superclasse
    @Override
    protected void ganharXP() {
        System.out.println(this.getNome() +" +10 de XP");
        this.setXp(this.getXp() + 10);
    }
    
    //metodos especiais
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    private void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
        this.ganharXP();
    }

    @Override
    public String toString() {
        return "{" +super.toString()+ " login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
