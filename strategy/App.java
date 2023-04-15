
public class App {

    public static void main(String args[]) {

        Animal bird = new Bird("tweet", 4);
        Animal cat = new Cat("sprinkles", 2);
        Animal dog = new Dog("nardles", 7);

        bird.fly();
        cat.fly();
        dog.fly();
    }
}