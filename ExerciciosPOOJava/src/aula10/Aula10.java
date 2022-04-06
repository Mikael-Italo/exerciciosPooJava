package aula10;

public class Aula10 {

    public static void main(String[] args) {
        
        //Pessoa p1 = new Pessoa();
        Professor p = new Professor();
        Aluno a = new Aluno();
        //Funcionario f = new Funcionario();
        
        a.setNome("Rodrigo");
        a.setIdade(22);
        a.setSexo("m");
        a.setCurso("TI");
        a.setMatricula(true);
        a.fazerAniv();
        
        p.setNome("Joana");
        p.setIdade(78);
        p.setSexo("f");
        p.setEspecialidade("Doutorado");
        p.setSalario(5608.7f);
        p.fazerAniv();
        p.receberAum(200.4f);
        
        
        a.ficha();
        a.fichaAluno();
    
        p.ficha();
        p.fichaProf();
    }
    
}
