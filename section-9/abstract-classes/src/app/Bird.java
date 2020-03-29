package app;

public abstract class Bird extends Animal implements CanFly {
	public Bird(String name) {
		super(name);
	}

	@Override
	public void move() {
		System.out.println(getName() + " is moving");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating");
	}
	
	@Override
	public void fly() {
		System.out.println(getName() + " is flying");
	}
}