package app;

public class Animal {
    private String name;
    private String family;

	public Animal(String name, String family) {
		this.name = name;
		this.family = family;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void move(int speed) {
        System.out.println("Animal.move(" + speed + ")");
    };
    
    public void eat() {
        System.out.println("Animal.eat()");
    };
}