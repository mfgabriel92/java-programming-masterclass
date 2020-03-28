package app;

public class Monitor {
    private String model;
    private double inches;

	public Monitor(String model, double inches) {
		this.model = model;
		this.inches = inches;
    }
    
    public String getModel() {
        return model;
    }

    public double getInches() {
        return inches;
    }
}