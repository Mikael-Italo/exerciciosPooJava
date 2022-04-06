package aula02e03;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    String tampada;
 
    
    void status (){
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cor:" + this.cor);
        System.out.println("Espessura da ponta:" + this.ponta);
        System.out.println("Quantidade de tinta:" + this.carga + "%");
        this.tampada();
        System.out.println("Status da tampa:" + this.tampada);   
        System.out.println("=========================================");
    
    }  
    void tampada (){
        if (this.tampa == true) {
            this.tampada = "Está tampada";
        }else{
            this.tampada = "Está destampada";
        }
    }
 
    void rabiscar(){
        if (this.tampa == true) {
            System.out.println("Destampe a caneta antes!");
        }else{
            System.out.println("Rabiscando");
        }
       
    }
    void tampar(){
        tampa = true;
    }
    void destampar(){
        tampa = false;
    }
    
    
}
