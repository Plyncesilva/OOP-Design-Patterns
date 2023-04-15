package src.Miudo;

import src.Gambozino.GambozinoBuilding;
import src.Gambozino.Gambozino;

/**
 * MiudoBuilding
 */
public class MiudoBuilding extends GambozinoBuilding {

    @Override
    protected Gambozino makeGambozino(String typeOfGambozino) {
        
        MiudoFactory miudoPartsFactory = new MiudoFactory();
        Miudo miudo = new Miudo(miudoPartsFactory);

        return miudo;
    }
    
}