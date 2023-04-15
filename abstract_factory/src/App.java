package src;

import src.Gambozino.GambozinoBuilding;
import src.Animador.AnimadorBuilding;
import src.Gambozino.Gambozino;

public class App {
    public static void main(String[] args) {
        GambozinoBuilding makeAnimadores = new AnimadorBuilding();
        
        Gambozino animador = makeAnimadores.orderGambozino(null);
        System.out.println(animador);
        
    }
    
}
