package aula11;

public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("renovando bolsa de "+this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" tem mensalidade facilitada");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
