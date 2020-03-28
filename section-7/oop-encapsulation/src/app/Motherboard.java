package app;

public class Motherboard {
    private String model;
    private int ramSlots;

    public Motherboard(String model, int ramSlots) {
		this.model = model;
		this.ramSlots = ramSlots;
	}

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void boot() {
        System.out.println("Motherboard.boot()");
        initBios();
    }

    private void initBios() {
        System.out.println("Motherboard.initBios()");
    }
}