package src.Animador;

import src.Gambozino.Gambozino;

public class Animador extends Gambozino{

    private AnimadorFactory factory;

    public Animador(AnimadorFactory factory) {
        this.factory = factory;
    }

    @Override
    public void animar() {
        System.out.println("Ohhhh... Gambozino!!!");
    }

    @Override
    public void makeGambozino() {
        // TODO Auto-generated method stub
        setName(this.factory.addGambozinoName());
        setAge(this.factory.addGambozinoAge());
        setSlogan(this.factory.addGambozinoSlogan());
    }    
    
}
