public class App {
    public static void main(String[] args) {
        StockExchange stock = new StockExchange(200.0, 197.0, 23.0);

        StockGrabber sg1 = new StockGrabber(stock);

        Runnable getIBMStock = new GetTheStock(5, "IBM", stock.getIBMPrice(), stock);

        new Thread(getIBMStock).start();
    }
}
