package app;

public class Monitor {
    private String model;
    private Resolution resolution;

	public Monitor(String model, Resolution resolution) {
		this.model = model;
		this.resolution = resolution;
    }
    
    public String getModel() {
        return model;
    }

    public Resolution getResolution() {
        return resolution;
    }
}