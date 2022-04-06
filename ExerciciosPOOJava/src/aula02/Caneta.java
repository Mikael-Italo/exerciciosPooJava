package aula02;

public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   protected boolean tampa;
    String tampada;
 
    
   public void status (){
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cor:" + this.cor);
        System.out.println("Espessura da ponta:" + this.ponta);
        System.out.println("Quantidade de tinta:" + this.carga + "%");
        this.tampada();
        System.out.println("Status da tampa:" + this.tampada);   
    
    }  
    void tampada (){
        if (this.tampa == true) {
            this.tampada = "Está tampada";
        }else{
            this.tampada = "Está destampada";
        }
    }
 
    public void rabiscar(){
        if (this.tampa == true) {
            System.out.println("Destampe a caneta antes!");
        }else{
            System.out.println("Rabiscando");
        }
       
    }
    protected void tampar(){
        tampa = true;
    }
    protected void destampar(){
        tampa = false;
    }
    
    
}
