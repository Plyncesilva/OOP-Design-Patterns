import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

    private int startTime;
    private String stock;
    private Double price;

    private StockExchange stockExchange;

    public GetTheStock(int startTime, String stock, Double price, StockExchange stockExchange) {
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
        this.stockExchange = stockExchange;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(this.startTime * 1000);
            } catch(InterruptedException e){
                System.out.println("System interrupted.");
            }

            Double randNum = (Math.random() * (0.6)) - 0.3;

            price = price + randNum;

            String methodName = "set" + stock + "Price";

            try {
                Method method = stockExchange.getClass().getMethod(methodName, Double.class);
                method.invoke(stockExchange, price);
            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println(stock + ": " + price + " +/- " + randNum);
        }
        
    }
}
