package src.Gambozino;

public abstract class GambozinoBuilding {

    protected abstract Gambozino makeGambozino(String typeOfGambozino);

    /**
     * @param typeOfGambozino
     * @return
     */
    public Gambozino orderGambozino(String typeOfGambozino){
        Gambozino gambozino = makeGambozino(typeOfGambozino);

        gambozino.makeGambozino();
        gambozino.animar();

        return gambozino;
    }

}