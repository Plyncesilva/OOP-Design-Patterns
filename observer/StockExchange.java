import java.util.ArrayList;

public class StockExchange implements Subject {

    ArrayList<Observer> observers;

    Double APPLEPrice;
    Double IBMPrice;
    Double GOOGLEPrice;

    public Double getAPPLEPrice() {
        return APPLEPrice;
    }

    public void setAPPLEPrice(Double APPLEPrice) {
        this.APPLEPrice = APPLEPrice;
        notifyObservers();
    }

    public Double getIBMPrice() {
        return IBMPrice;
    }

    public void setIBMPrice(Double IBMPrice) {
        this.IBMPrice = IBMPrice;
        notifyObservers();
    }

    public Double getGOOGLEPrice() {
        return GOOGLEPrice;
    }

    public void setGOOGLEPrice(Double GOOGLEPrice) {
        this.GOOGLEPrice = GOOGLEPrice;
        notifyObservers();
    }

    public StockExchange(Double APPLEPrice, Double IBMPrice, Double GOOGLEPrice) {
        this.observers = new ArrayList<Observer>();

        this.APPLEPrice = APPLEPrice;
        this.IBMPrice = IBMPrice;
        this.GOOGLEPrice = GOOGLEPrice;
    }

    @Override
    public void register(Observer o) {
        if (this.observers.contains(o)) {
            throw new UnsupportedOperationException("Observer is already subscribed");
        }   
        else {
            this.observers.add(o);
            System.out.println("Just registered an observer ID");
        }
    }

    @Override
    public void unregister(Observer o) {
        if (this.observers.contains(o)) {
            this.observers.remove(o);
        }
        else {
            throw new UnsupportedOperationException("Observer is not a subscriber.");
        }
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(
            o -> {o.update(getAPPLEPrice(), getIBMPrice(), getGOOGLEPrice());
        });
    }
   
}
