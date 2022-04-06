package aula7_jogodelutafeitodiferente;

import java.util.Random;

//atributos
public class Luta implements Lutar{
    private Lutador lutador1;
    private Lutador lutador2;
    private int rounds;
    private boolean aprovada;
    //varial publica para organização na Void
    public static boolean statusLuta;
    
//metodos publicos
    @Override
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())) {
            if (l1.getNome() != l2.getNome()) {
                this.setAprovada(true);
                Luta.setStatusLuta(true);
                this.setLutador1(l1);
                this.setLutador2(l2);
            }else{
                System.out.println("Lutadores devem ser diferentes");
                this.setAprovada(false);
                Luta.setStatusLuta(false);
                this.setLutador1(null);
                this.setLutador2(null);
            }
        }else{
            System.out.println("Lutadores devem ser da mesma categoria");
            this.setAprovada(false);
            Luta.setStatusLuta(false);
            this.setLutador1(null);
            this.setLutador2(null);
        }
    }
    
    

	@Override
    public void lutar(){
    	//Random de 0 a 2 define o resultado da luta
        if (this.aprovada) {
            System.out.println("1º Lutador: ");
            this.lutador1.apresentar();
            System.out.println("2º Lutador: ");
            this.lutador2.apresentar();
            
            Random r = new Random(); //instancia do random, para gerar aleatorios
            int vencedor = r.nextInt(3);// 0 1 2 (3 = aleatórios, de 0 a 2 contando o zero)
            
            switch(vencedor){
                case 0: //empate
                    System.out.println("-------RESULTADO--------");
                    System.out.println("Empatou!");
                    this.lutador1.empatarLuta();
                    this.lutador2.empatarLuta();
                    break;
                    
                case 1://ganha lutador1
                    System.out.println("-------RESULTADO--------");
                    System.out.println("Vitória: "+this.lutador1.getNome());
                    System.out.println("Derrota: "+this.lutador2.getNome());
                    this.lutador1.ganharLuta();
                    this.lutador2.perderLuta();
                    break;
                    
                case 2://ganha lutador 2
                    System.out.println("-------RESULTADO--------");
                    System.out.println("Vitória: "+this.lutador2.getNome());
                    System.out.println("Derrota: "+this.lutador1.getNome());
                    this.lutador2.ganharLuta();
                    this.lutador1.perderLuta();
                    break;
            }
        }else{
            System.out.println("Essa luta não pode acontecer, tente novamente!"); 
        }
        System.out.println("===========================");
    }   

   
    
    //get e set
    public Lutador getLutador1() {
        return lutador1;
    }

    public void setLutador1(Lutador lutador1) {
        this.lutador1 = lutador1;
    }

    public Lutador getLutador2() {
        return lutador2;
    }

    public void setLutador2(Lutador lutador2) {
        this.lutador2 = lutador2;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public static boolean isStatusLuta() {
		return statusLuta;
	}

	public static void setStatusLuta(boolean statusLuta) {
		Luta.statusLuta = statusLuta;
	}

    
}