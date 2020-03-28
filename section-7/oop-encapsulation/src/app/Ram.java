package app;

public class Ram {
    private String model;
    private int storageSize;
    
	public Ram(String model, int storageSize) {
		this.model = model;
		this.storageSize = storageSize;
	}

    public String getModel() {
        return model;
    }

    public int getStorageSize() {
        return storageSize;
    }
}