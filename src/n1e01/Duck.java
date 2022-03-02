package n1e01;

public class Duck extends Bird{
    @Override
    public void makeNoise() {
        System.out.println("Quack!");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking!");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");
    }
}
