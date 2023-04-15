public class StockGrabber implements Observer{

    public static int OBSERVER_ID_TRACKER = 0;
    StockExchange stock;
    int OBSERVER_ID;

    Double ibmPrice;
    Double applePrice;
    Double googlePrice;

    @Override
    public String toString() {
        return "StockGrabber [stock=" + stock + ", OBSERVER_ID=" + OBSERVER_ID + ", ibmPrice=" + ibmPrice
                + ", applePrice=" + applePrice + ", googlePrice=" + googlePrice + "]";
    }

    public Double getIbmPrice() {
        return ibmPrice;
    }

    public Double getApplePrice() {
        return applePrice;
    }

    public Double getGooglePrice() {
        return googlePrice;
    }

    public StockGrabber(StockExchange stock) {
        this.stock = stock;
        stock.register(this);
        this.OBSERVER_ID = OBSERVER_ID_TRACKER++;
    }

    @Override
    public void update(Double applePrice, Double ibmPrice, Double googlePrice) {
        this.applePrice = applePrice;
        this.ibmPrice = ibmPrice;
        this.googlePrice = googlePrice;
        System.out.print(this);
    }

    public int getOBSERVER_ID() {
        return this.OBSERVER_ID;
    }
    
}
