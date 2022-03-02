package n1e01;

public class Main {
    public static void main(String[] args) {
        //Animal base class does nothing
        Animal animal = new Animal();
        animal.makeNoise();
        animal.walk();
        animal.swim();
        animal.fly();

        //Dog class inherits Animal and overrides some methods
        Dog Dog = new Dog();
        Dog.makeNoise();
        Dog.walk();
        Dog.swim();
        Dog.fly();

        //Bird class inherits Animal and overrides some methods
        Bird Bird = new Bird();
        Bird.makeNoise();
        Bird.walk();
        Bird.swim();
        Bird.fly();

        //Duck class inherits Bird and overrides all methods
        Duck Duck = new Duck();
        Duck.makeNoise();
        Duck.walk();
        Duck.swim();
        Duck.fly();


    }
}
