import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GambozinoFactory gbzFactory = new GambozinoFactory();

        Gambozino gbz = gbzFactory.makeGambozino(scanner.nextLine());
        scanner.close();

        System.out.print(gbz.getName() + ":" + gbz.getAge() + ":");
        gbz.speak();
    }
    
}
