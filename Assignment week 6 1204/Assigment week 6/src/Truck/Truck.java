package Truck;

import Vehicle.Vehicle;

public class Truck extends Vehicle {
    private String container;
    private boolean hasHandBrake;
    private String sound;
    private String engine;
    private boolean hasAC;
    public Truck(String model, String make, int numberOfWheels, int topSpeed, boolean hasAC, String container, boolean hasHandBreak, String sound, String engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.container = container; 
        this.hasHandBrake = hasHandBreak;
        this.sound = sound;
        this.engine = engine;
        this.hasAC = hasAC;
    }
    
    public Truck() {
        this.container = "close";
        this.hasHandBrake = true;
        this.engine = "V8";
        this.sound = "roar";
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public boolean isHasHandBrake() {
        return hasHandBrake;
    }

    public void setHasHandBrake(boolean hasHandBrake) {
        this.hasHandBrake = hasHandBrake;
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating...");
        this.topSpeed += 10;
        System.out.println("Current speed: " + this.getTopSpeed());
    }

    public void handbrake() {
        System.out.println("You are hand breaking...");
        this.topSpeed = 0; 
        System.out.println("Curren speed: " + this.getTopSpeed());
    }

    public void openContainer() {
        System.out.println("Your container is opening");
        this.container = "open";
    }

    public void getTruckInformation() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Topspeed: " + this.getTopSpeed());
        System.out.println("Number of wheels: " + this.getNumberOfWheels());
        System.out.println("AC: " + this.isHasAC());
        System.out.println("Container is: " + this.getContainer());
        System.out.println("Sound: " + this.getSound());
        System.out.println("Engine: " + this.getEngine());
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    } 

}