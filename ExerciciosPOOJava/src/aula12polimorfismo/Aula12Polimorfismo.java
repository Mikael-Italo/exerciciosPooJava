package aula12polimorfismo;

public class Aula12Polimorfismo {

    public static void main(String[] args) {
        //mamífero
        Mamifero m = new Mamifero();
        m.setPeso(85.5f);
        m.setIdade(5);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        m.dados();
        System.out.println("=============");
        //reptil
        Reptil r = new Reptil();
        r.setPeso(2.1f);
        r.setIdade(2);
        r.setMembros(4);
        r.locomover();
        r.alimentar();
        r.emitirSom();
        r.dados();
        System.out.println("==============");
        //peixe
        Peixe p = new Peixe();
        p.setPeso(0.3f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.fazerBolha();
        p.dados();
        System.out.println("================");
        //ave
        Ave a = new Ave();
        a.setPeso(0.12f);
        a.setIdade(3);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        a.dados();
        System.out.println("===============");
        //canguru
        Canguru c = new Canguru();
        c.setPeso(54);
        c.setIdade(7);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        c.dados();
        System.out.println("================");
        //cachorro
        Cachorro k = new Cachorro();
        k.setPeso(45.8f);
        k.setIdade(6);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.enterrarOsso();
        k.abanarRabo();
        k.dados();
        System.out.println("=================");
        //tartaruga
        Tartaruga t = new Tartaruga();
        t.setPeso(2.4f);
        t.setIdade(101);
        t.setMembros(4);
        t.locomover();
        t.alimentar();
        t.emitirSom();
        t.dados();
        System.out.println("===============");
        //arara
        Arara ar = new Arara();
        ar.setPeso(0.1f);
        ar.setIdade(3);
        ar.setMembros(2);
        ar.locomover();
        ar.alimentar();
        ar.emitirSom();
        ar.dados();
        //Se criar outros objetos terão os mesmos atributos da sua projenitora como fiz acimaa
        //quando chamado. So instaciar e ser feliz! sobreponha para mudar o retorno, isso e polimorfismo
    }
    
}
