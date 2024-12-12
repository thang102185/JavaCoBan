import java.util.Scanner;

class Animal{
    protected String name;
    protected int numOfLegs;

    public Animal(String name, int numOfLegs) {
        this.name = name;
        this.numOfLegs = numOfLegs;
    }
    public void makeSound(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public String toString() {
        return String.format("Animal(%s, %d)", getName(), getNumOfLegs());
    }
}
class Bird extends Animal {
    public Bird(String name, int numOfLegs) {
        super(name, numOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("TWEET");
    }

    @Override
    public String toString() {
        return String.format("Bird(%s, %d)", getName(), getNumOfLegs());
    }
}
class Cow extends Animal {
    public Cow(String name, int numOfLegs) {
        super(name, numOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("MOO");
    }

    @Override
    public String toString() {
        return String.format("Cow(%s, %d)", getName(), getNumOfLegs());
    }
}
class Dog extends Animal {
    public Dog(String name, int numOfLegs) {
        super(name, numOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("WOOF");
    }

    @Override
    public String toString() {
        return String.format("Dog(%s, %d)", getName(), getNumOfLegs());
    }
}
public class Cau4Lan3 {
    public static void main(String[] args) {

    }
}
