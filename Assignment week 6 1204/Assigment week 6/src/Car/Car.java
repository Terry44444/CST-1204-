package Car;

import Vehicle.Vehicle;

public class Car extends Vehicle {
    private boolean hasAC; 
    private String engine;
    private String sound;

    public Car(String model, String make, int numberOfWheels, int topSpeed, boolean hasAC, String engine, String sound) {
        super(model, make, numberOfWheels, topSpeed);
        this.hasAC = hasAC;
        this.engine = engine;
        this.sound = sound;
    }

    public Car() {
        this.hasAC = true;
        this.engine = "V8";
        this.sound = "roar";
    }
    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public boolean getHasAC() {
        return hasAC;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
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

    public void handbrake() {
        System.out.println("You are hand breaking...");
        this.topSpeed = 0; 
        System.out.println("Curren speed: " + this.getTopSpeed());
    }

    
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void getCarInformation() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Topspeed: " + this.getTopSpeed());
        System.out.println("Number of wheels: " + this.getNumberOfWheels());
        System.out.println("Sound: " + this.getSound());
        System.out.println("Engine: " + this.getEngine());
    }




}

