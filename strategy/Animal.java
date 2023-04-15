
public class Animal {

    String name;
    int age;

    Flies flyType;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Flies getFlyType() {
        return flyType;
    }

    public void setFlyType(Flies flyType) {
        this.flyType = flyType;
    }

    public void fly(){
        System.out.println(flyType.fly());
    }

}