package src.Dinossauro;

import src.Gambozino.*;

public class Dinossauro extends Gambozino{

    private DinossauroFactory factory;

    public Dinossauro(DinossauroFactory factory) {
        this.factory = factory;
    }

    @Override
    public void animar() {
        System.out.println("Gambozinos! Querem saber quem criou esta associacao?");
    }

    @Override
    public void makeGambozino() {
        setName(this.factory.addGambozinoName());
        setAge(this.factory.addGambozinoAge());
        setSlogan(this.factory.addGambozinoSlogan());
    }

}
