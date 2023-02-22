package HatchBack;

import Car.Car;

public class HatchBack extends Car{
    private String carType;

    

    public HatchBack(String model, String make, int numberOfWheels, int topSpeed, boolean hasAC, String engine,
            String sound, String carType) {
        super(model, make, numberOfWheels, topSpeed, hasAC, engine, sound);
        this.carType = carType;
    }

    public HatchBack() {
       this.carType = "HatchBack";
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


}

