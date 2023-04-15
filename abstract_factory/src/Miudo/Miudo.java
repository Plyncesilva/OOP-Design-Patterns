package src.Miudo;

import src.Gambozino.Gambozino;

public class Miudo extends Gambozino{

    private MiudoFactory factory;

    public Miudo(MiudoFactory factory) {
        this.factory = factory;
    }

    @Override
    public void animar() {
        // TODO Auto-generated method stub
        System.out.println("Ahhhhhhh ahaha haha aha ha");
    }

    @Override
    public void makeGambozino() {
        setName(this.factory.addGambozinoName());
        setAge(this.factory.addGambozinoAge());
        setSlogan(this.factory.addGambozinoSlogan());
    }
    
}
