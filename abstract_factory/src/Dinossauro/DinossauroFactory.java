package src.Dinossauro;

import src.Gambozino.GambozinoFactory;
import src.Parts.*;

public class DinossauroFactory implements GambozinoFactory{

    @Override
    public Age addGambozinoAge() {
        // TODO Auto-generated method stub
        return new DinossauroAge();
    }

    @Override
    public Name addGambozinoName() {
        // TODO Auto-generated method stub
        return new DinossauroName();
    }

    @Override
    public Slogan addGambozinoSlogan() {
        // TODO Auto-generated method stub
        return new DinossauroSlogan();
    }
    
}
