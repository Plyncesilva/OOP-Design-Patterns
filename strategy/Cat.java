
public class Cat extends Animal {

    
    public Cat(String name, int age) {
        super(name, age);
        setFlyType(new KindaFly());
    }

}