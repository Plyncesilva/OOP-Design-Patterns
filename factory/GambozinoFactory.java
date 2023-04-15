public class GambozinoFactory {

    public Gambozino makeGambozino(String name){
        if (name.equals("A")){
            return new Animador();
        }
        else if (name.equals("D")) {
            return new Dinossauro();
        }
        else if (name.equals("M")) {
            return new Miudo();
        }
        else {
            return null;
        }
    }
}
