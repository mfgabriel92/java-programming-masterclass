package app;

public class App {
    public static void main(String[] args) throws Exception {
        Car yaris = new Car();

        yaris.setModel("Ford");
        System.out.println(yaris.getModel());
    }
}