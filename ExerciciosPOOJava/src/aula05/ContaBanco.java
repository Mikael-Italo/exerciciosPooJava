package aula05;

public class ContaBanco {
    
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //construtor padrão
    public ContaBanco() {
        this.setSaldo(0.0f);
        this.setStatus(false);
    }
    
    //métodos de operação
    public void abrirConta(String t){
        
        if (t == "cc") {
            this.setSaldo(50);
            this.setStatus(true);
            this.setTipo(t);
        }else if (t == "cp") {
            this.setSaldo(150);
            this.setStatus(true);
            this.setTipo(t);
        }else{
            System.out.println("Tipo de conta informado não existe");
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta tem dinheiro");
        }else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
        }
    }
    
    public void depositar(float d){
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + d);
        }else{
            System.out.println("A conta está inativa!");
        }
    }
    
    public void sacar(float s){
        if (this.getStatus() == true) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar, está inativa");
        }
    }
    
    public void pagarMensal(){
        float v;
        if (this.getTipo() == "cc") {
            v = 12;
        }else{
            v = 20;
        }
        
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel pagar");
        }
    }
    

    //Métodos especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
