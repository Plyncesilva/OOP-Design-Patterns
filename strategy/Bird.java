public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
        setFlyType(new CanFly());
    }
    
}
