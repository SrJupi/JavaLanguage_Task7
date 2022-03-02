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
        Dog dog = new Dog();
        dog.makeNoise();
        dog.walk();
        dog.swim();
        dog.fly();

        //Bird class inherits Animal and overrides some methods
        Bird bird = new Bird();
        bird.makeNoise();
        bird.walk();
        bird.swim();
        bird.fly();

        //Duck class inherits Bird and overrides all methods
        Duck duck = new Duck();
        duck.makeNoise();
        duck.walk();
        duck.swim();
        duck.fly();


    }
}
