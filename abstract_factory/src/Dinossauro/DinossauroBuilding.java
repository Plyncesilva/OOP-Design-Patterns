package src.Dinossauro;

import src.Gambozino.GambozinoBuilding;
import src.Gambozino.Gambozino;

public class DinossauroBuilding extends GambozinoBuilding{

    @Override
    protected Gambozino makeGambozino(String typeOfGambozino) {
        
        Dinossauro dinossauro = null;

        DinossauroFactory dinossauroPartsFactory = new DinossauroFactory();
        dinossauro = new Dinossauro(dinossauroPartsFactory);

        return dinossauro;
    }
    
}
