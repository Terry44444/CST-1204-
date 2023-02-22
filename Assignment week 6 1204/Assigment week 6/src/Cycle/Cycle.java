package Cycle;

import Vehicle.Vehicle;

public class Cycle extends Vehicle{

    public Cycle(String model, String make, int numberOfWheels, int topSpeed) {
        super(model, make, numberOfWheels, topSpeed);
    }
    public void getCycleInformation() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Topspeed: " + this.getTopSpeed());
        System.out.println("Number of wheels: " + this.getNumberOfWheels());
    }

    
}
