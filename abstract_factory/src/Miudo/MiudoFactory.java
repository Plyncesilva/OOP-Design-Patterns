package src.Miudo;

import src.Gambozino.GambozinoFactory;
import src.Parts.*;

/**
 * MiudoFactory
 */
public class MiudoFactory implements GambozinoFactory{

    @Override
    public Age addGambozinoAge() {
        // TODO Auto-generated method stub
        return new MiudoAge();
    }

    @Override
    public Name addGambozinoName() {
        // TODO Auto-generated method stub
        return new MiudoName();
    }

    @Override
    public Slogan addGambozinoSlogan() {
        // TODO Auto-generated method stub
        return new MiudoSlogan();
    }
    
    
}