package Sedan;

import Car.Car;

public class Sedan extends Car{
    private String carType;

    public Sedan(String model, String make, int numberOfWheels, int topSpeed, boolean hasAC, String engine,
            String sound, String carType) {
        super(model, make, numberOfWheels, topSpeed, hasAC, engine, sound);
        this.carType = carType;
    }

    public Sedan() {
        this.carType = "Sedan";
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    
    
    
}
