package Vehicle;

public class Vehicle {
    private String model;
    private String make;
    private int numberOfWheels;
    public int topSpeed;

    public Vehicle(String model, String make, int numberOfWheels, int topSpeed) {
        this.model = model;
        this.make = make;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
    }

    public Vehicle() {
        this.model = "not defined";
        this.make = "not defined";
        this.numberOfWheels = 4;
        this.topSpeed = 0;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void getVehicleInformation() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Topspeed: " + this.getTopSpeed());
        System.out.println("Number of wheels: " + this.getNumberOfWheels());
    }
} 
