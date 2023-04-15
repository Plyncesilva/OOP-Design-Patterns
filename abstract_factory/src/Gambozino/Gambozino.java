package src.Gambozino;

import src.Parts.*;

public abstract class Gambozino {
    private Name name;
    private Age age;
    private Slogan slogan;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Slogan getSlogan() {
        return slogan;
    }

    public void setSlogan(Slogan slogan) {
        this.slogan = slogan;
    }

    public abstract void animar();
    public abstract void makeGambozino();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Eu sou um Gambozino com nome " + getName() + ", com " + getAge() + " anos, e o meu slogan e:\n\"" + getSlogan() + "\"";
    }
}