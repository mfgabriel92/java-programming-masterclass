package app;

public class Dog extends Animal {
    private String petName;
    private String breed;
    private String furColor;
    private String portSize;

	public Dog(String petName, String breed, String furColor, String portSize) {
        super("Dog", "Mammal");
       
        this.petName = petName;
        this.breed = breed;
        this.furColor = furColor;
        this.portSize = portSize;
    }
    
    public void bark() {
        System.out.println("Dog.bark()");
    }

    public void jump() {
        System.out.println("Dog.jump()");
    }

	@Override
	public void eat() {
        System.out.println("Dog.eat()");
        chew();
		super.eat();
    }
    
    private void chew() {
        System.out.println("Dog.chew()");
    }
}