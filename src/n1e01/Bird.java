package n1e01;

public class Bird extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Tweet!");
    }

    @Override
    public void walk() {
        System.out.println("Bird is walking!");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

}
