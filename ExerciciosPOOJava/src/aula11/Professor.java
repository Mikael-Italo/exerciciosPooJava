package aula11;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
  
    
    //metodos publicos
    public void receberAumento(float s){
        this.setSalario(this.getSalario() + s);
    }
    
    //metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    

}


