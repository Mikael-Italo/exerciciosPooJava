package aula10;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    //metodos publicos
    public void mudarTrabalho(){
        if (this.isTrabalhando()) {
            this.setTrabalhando(false);
        }else{
            this.setTrabalhando(true);
        }
    }
    
    //metodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
