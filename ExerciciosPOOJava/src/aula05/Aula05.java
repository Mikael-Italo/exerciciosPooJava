package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("cc");
        c1.depositar(200);
        c1.sacar(250);
        System.out.println("Saldo: "+ c1.getSaldo());
        //c1.fecharConta();
        System.out.println(c1.getStatus());
    }
    
}
