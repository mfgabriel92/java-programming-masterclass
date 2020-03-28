package app;

public class Computer {
    private String model;
    private Motherboard motherboard;
    private Ram ram;
    private Monitor monitor;

	public Computer(String model, Motherboard motherboard, Ram ram, Monitor monitor) {
		this.model = model;
		this.motherboard = motherboard;
        this.ram = ram;
        this.monitor = monitor;
    }
    
    public void powerUp() {
        System.out.println("Computer.powerUp()");
        motherboard.boot();
    }
}