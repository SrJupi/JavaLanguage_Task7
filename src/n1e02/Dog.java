package n1e02;

public class Dog extends Animal {
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

    /**
     * @deprecated
     * dogs should not be put on fights for fun
     */
    @Deprecated
    public void attack(){
        System.out.println("This dog attacked...");
    }
}
