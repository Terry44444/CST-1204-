import Bike.Bike;
import Car.Car;
import Cycle.Cycle;
import HatchBack.HatchBack;
import Sedan.Sedan;
import Truck.Truck;
import Vehicle.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle1 = new Vehicle("Audi", "4 Coupes", 4, 100);
        vehicle1.getVehicleInformation();

        System.out.println("*****************************");

        Car car1 = new Car("Audi", "4 Coupes", 4, 100, true, "V8", "brrrrr");
        car1.getCarInformation();

        System.out.println("*****************************");

        Sedan sedan = new Sedan("Honda Civic", "Type R", 4, 100, true, "2.0-liter VTEC", "brrrrr", "Sedan");
        sedan.getCarInformation();

        System.out.println("*****************************");
    
        HatchBack hatchback = new HatchBack("Nissan", "Altima", 4, 5, false, "V3", "brrrrr", "Hatchback");
        hatchback.getCarInformation();

        System.out.println("*****************************");

        Bike bike = new Bike("Schwinn", "S29", 2, 21, "30cc");
        bike.getBikeInformation();

        System.out.println("*****************************");
                
        Truck truck = new Truck("Ford", "F-150", 4,15,true, "close", true, "brrrrr", "3.3L Ti-VCT V6");
        truck.getTruckInformation();

        System.out.println("*****************************");

        Cycle cycle = new Cycle("Indoor cycle", "5.0 IC", 0, 0);
        cycle.getCycleInformation();
    }
}

