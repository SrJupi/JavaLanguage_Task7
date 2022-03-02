package n1e02;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        //Dog class inherits Animal but have deprecated method "attack"
        Dog dog = new Dog();

        dog.makeNoise();
        dog.attack();



    }
}
