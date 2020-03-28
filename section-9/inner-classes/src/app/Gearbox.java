package app;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maximumGears;
    private int currentGear;
    private boolean isClutchIn;
    
    public Gearbox(int maximumGears) {
        this.gears = new ArrayList<>();
        this.maximumGears = maximumGears;

        this.gears.add(new Gear(0, 0.0));
    }

    public void operateClutch(boolean isIn) {
        this.isClutchIn = isIn;
    }

    public void changeGear(int number) {
        if (number >= 0 && number <= maximumGears && this.isClutchIn) {
            this.currentGear = number;
        }
    }

    public double wheelSpeed(int revs) {
        if (this.isClutchIn) {
            System.out.println("Wyyyyyyyyyyyyyyyyr");
            return 0.0;
        }

        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
        }
        
        public double drivingSpeed(int revs) {
            return revs * this.ratio;
        }
        
        public double getRatio() {
            return ratio;
        }
    }
}