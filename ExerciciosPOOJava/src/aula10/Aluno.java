package aula10;

public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;
    
    
    //metodos publicos
    public void cancelarMatr(){
        this.setMatricula(false);
    }
    
    public void fichaAluno(){
        System.out.println("=Situação do aluno ======");
        System.out.println("Curso: "+ this.getCurso());
        if (isMatricula()) {
            System.out.println("Matricula ativa!");
        }else{
            System.out.println("Matricula inativa");
        }
    }
    
    
    //metodos especiais
    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {    
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
