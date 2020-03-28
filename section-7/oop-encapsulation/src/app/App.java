package app;

public class App {
    public static void main(String[] args) throws Exception {
        Motherboard motherboard = new Motherboard("XYZ", 4);
        Ram ram = new Ram("XYZ", 16);
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("xyz", resolution);
        Computer computer = new Computer("xyz", motherboard, ram, monitor);

        computer.powerUp();
    }
}