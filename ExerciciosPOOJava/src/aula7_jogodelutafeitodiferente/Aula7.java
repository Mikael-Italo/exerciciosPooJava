package aula7_jogodelutafeitodiferente;

import java.util.Random;

public class Aula7 {
    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[11];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufcobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        l[6] = new Lutador("Lidiane", "Brasil", 27, 1.60f, 65f, 2, 1, 0);
        l[7] = new Lutador("Micaela", "Inglaterra", 25, 1.55f, 52f, 3, 1, 1);
        l[8] = new Lutador("Milena", "Eslovênia", 21, 1.55f, 50.3f, 2, 0, 1);
        l[9] = new Lutador("Marcelo", "Itália", 18, 1.81f, 65f, 2, 1, 0);
        l[10] = new Lutador("Sueli", "Suiça", 44, 1.60f, 55f, 4, 2, 1);
        //Adicione quantos lutadores quiser, divirta-se!
        
        Luta UFC1 = new Luta();
        
        //Aqui estou criando uma random para escolha de 2 lutadores aleatórios!
        Random r1 = new Random();
        int lutador1 = r1.nextInt(l.length);//numero aleatorio do tamanho do array!
        Random r2 = new Random();
        int lutador2 = r2.nextInt(l.length);//numero aleatorio do tamanho do array!
        
        Lutador l1 = l[lutador1]; //procura qual lutador1 vai ser e atribui a variavel l1, de acordo com a posição do array!
        Lutador l2 = l[lutador2];//procura qual lutador2 vai ser e atribui a variavel l2, de acordo com a posição do array!
        
        UFC1.marcarLuta(l1, l2);//Tentativa de marcar a luta entre os escolhidos, passando por todas validações!
        UFC1.lutar();//se confirmada, lutem! Se não e exibida na tela a mensagem!
        
        //Se o boolean retornar true exibe as informações, se não somente a mensagem de erro implementada!
        if (Luta.isStatusLuta()) {
        	//Se aprovado, mostrar os status atualizados dos lutadores, após a luta!
            l1.status();
            System.out.println("======================");
            l2.status();
		}
        
    }
    
}
