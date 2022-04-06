package aula10;

public class Professor extends Pessoa{
    //atributos
    private String especialidade;
    private float salario;
    
    //metodos publicos
    public void receberAum(float s){
        this.setSalario(this.getSalario() + s);
    }
    
    public void fichaProf(){
        System.out.println("=Situação do professor ====");
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println("Salário: R$ "+this.getSalario());
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
