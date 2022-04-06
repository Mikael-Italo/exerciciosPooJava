package aula11;

public class Aula11 {

    public static void main(String[] args) {
       //visitante
        Visitante v = new Visitante();
        v.setNome("Jorge");
        v.setIdade(18);
        v.setSexo("m");
        System.out.println(v.toString());
       //aluno
        Aluno a = new Aluno();
        a.setNome("Amadeu");
        a.setIdade(22);
        a.setSexo("m");
        a.setMatricula(212132);
        a.setCurso("Informática");
        System.out.println(a.toString());
        //professor ===>
        
    }
    
}
