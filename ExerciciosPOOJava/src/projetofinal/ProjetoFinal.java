package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        //video
        Video[] v = new Video[2];
        v[0]= new Video("Aula 15b");
        v[1] = new Video("Projeto final");        
        //gafanhoto
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Mikael", "m", 24, "mikael@gafa");
        g[1] = new Gafanhoto("Juriscleide", "f", 58, "juris@cleide");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]);						/*Avaliação*/	vis[0].avaliar(50f); //=5
        vis[1] = new Visualizacao(g[0], v[0]);/*like*/	v[0].like();/*Avaliação*/	vis[1].avaliar(5);
        vis[2] = new Visualizacao(g[1], v[1]);/*like*/	v[1].like();/*Avaliação*/	vis[2].avaliar(97f); //=10
        vis[3] = new Visualizacao(g[1], v[0]);						/*Avaliação*/	vis[3].avaliar(78f); //=9
        vis[4] = new Visualizacao(g[1], v[1]);/*like*/	v[1].like();/*Avaliação*/	vis[4].avaliar(7);
        
        
        
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());        
    
    
    }
    
    
}
