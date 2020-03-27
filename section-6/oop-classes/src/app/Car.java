package app;

public class Car {
    private int doors;
    private String model;
    private String color;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String m = model.toLowerCase();

        if (m.equals("yaris")) {
            this.model = model;
        } else {
            this.model = "Unkonwn";
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}