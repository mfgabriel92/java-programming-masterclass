package app;

public class Computer {
    private String model;
    private Motherboard motherboard;
    private Ram ram;

	public Computer(String model, Motherboard motherboard, Ram ram) {
		this.model = model;
		this.motherboard = motherboard;
		this.ram = ram;
    }
    
    public String getModel() {
        return model;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Ram getRam() {
        return ram;
    }
}