package src.Animador;

import src.Gambozino.GambozinoBuilding;
import src.Gambozino.Gambozino;

public class AnimadorBuilding extends GambozinoBuilding {

    @Override
    protected Gambozino makeGambozino(String typeOfGambozino) {
        
        Gambozino gambozino = null;

        // different types of animador?? como usar aqui o typeOfGambozino?
        AnimadorFactory animadorPartsFactory = new AnimadorFactory();
        gambozino = new Animador(animadorPartsFactory); 

        return gambozino;
    }
        
}
