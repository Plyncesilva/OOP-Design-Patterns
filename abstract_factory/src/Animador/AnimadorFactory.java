package src.Animador;

import src.Gambozino.GambozinoFactory;
import src.Parts.*;

public class AnimadorFactory implements GambozinoFactory {

    @Override
    public Age addGambozinoAge() {
        // TODO Auto-generated method stub
        return new AnimadorAge();
    }

    @Override
    public Name addGambozinoName() {
        // TODO Auto-generated method stub
        return new AnimadorName();
    }

    @Override
    public Slogan addGambozinoSlogan() {
        // TODO Auto-generated method stub
        return new AnimadorSlogan();
    }

}
