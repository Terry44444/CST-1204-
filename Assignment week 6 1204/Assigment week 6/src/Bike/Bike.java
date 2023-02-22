package Bike;

import Vehicle.Vehicle;

public class Bike extends Vehicle {
    private String engine;

    public Bike(String model, String make, int numberOfWheels, int topSpeed, String engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.engine = engine;
    }

    public Bike(){
        
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating...");
        this.topSpeed += 10;
        System.out.println("Current speed: " + this.getTopSpeed());
    }

    public void breaking() {
        System.out.println("Break.....!!!");
        this.topSpeed = 0;
        System.out.println("Curren speed: " + this.getTopSpeed());

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void getBikeInformation() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Topspeed: " + this.getTopSpeed());
        System.out.println("Number of wheels: " + this.getNumberOfWheels());
    }

}
