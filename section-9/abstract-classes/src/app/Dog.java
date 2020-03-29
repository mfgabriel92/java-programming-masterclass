package app;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
    }

	@Override
	public void move() {
        System.out.println(getName() + " is moving.");
	}

	@Override
	public void eat() {
        System.out.println(getName() + " is eating");
	}
}