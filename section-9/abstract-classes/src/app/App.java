package app;

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Yuki");
        dog.eat();

        Bird bird = new Parrot("Parrot");
        bird.eat();
        bird.move();
        bird.fly();
    }
}