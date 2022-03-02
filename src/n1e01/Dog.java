package n1e01;

public class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Bark!");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming!");
    }
}
