// Superclass
abstract class Vehicle {
    private String modelName;

    public Vehicle(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() { return modelName; }
    public void setModelName(String modelName) { this.modelName = modelName; }

    // Abstract method to be implemented by subclasses
    public abstract double fuelCost(double km);
}

// Subclasses
class Car extends Vehicle {
    private double mileagePerLiter;
    private double fuelPrice;

    public Car(String modelName, double mileagePerLiter, double fuelPrice) {
        super(modelName);
        this.mileagePerLiter = mileagePerLiter;
        this.fuelPrice = fuelPrice;
    }

    @Override
    public double fuelCost(double km) {
        return (km / mileagePerLiter) * fuelPrice;
    }
}

class Bus extends Vehicle {
    private double mileagePerLiter;
    private double fuelPrice;

    public Bus(String modelName, double mileagePerLiter, double fuelPrice) {
        super(modelName);
        this.mileagePerLiter = mileagePerLiter;
        this.fuelPrice = fuelPrice;
    }

    @Override
    public double fuelCost(double km) {
        // Buses might have lower mileage and different fuel types (e.g., Diesel)
        return (km / mileagePerLiter) * fuelPrice;
    }
}

class Bike extends Vehicle {
    private double mileagePerLiter;
    private double fuelPrice;

    public Bike(String modelName, double mileagePerLiter, double fuelPrice) {
        super(modelName);
        this.mileagePerLiter = mileagePerLiter;
        this.fuelPrice = fuelPrice;
    }

    @Override
    public double fuelCost(double km) {
        return (km / mileagePerLiter) * fuelPrice;
    }
}

// Adding new functionality without changing existing code (Open/Closed Principle)
class ElectricCar extends Vehicle {
    private double kmPerKwh;
    private double electricityRate;

    public ElectricCar(String modelName, double kmPerKwh, double electricityRate) {
        super(modelName);
        this.kmPerKwh = kmPerKwh;
        this.electricityRate = electricityRate;
    }

    @Override
    public double fuelCost(double km) {
        return (km / kmPerKwh) * electricityRate;
    }

    public void displayBatteryHealth() {
        System.out.println(getModelName() + " Battery Health: Optimal 100%");
    }
}

// Main class
public class TransportFleetManager {
    public static void main(String[] args) {
        double distanceToTravel = 150.5; // in km

        // Array of Vehicle objects (Polymorphism)
        Vehicle[] fleet = {
            new Car("Honda City", 15.0, 100.0),
            new Bus("Volvo City Bus", 5.0, 90.0),
            new Bike("Royal Enfield", 35.0, 100.0),
            new ElectricCar("Tesla Model 3", 6.5, 8.5)
        };

        System.out.println("--- Fleet Fuel Cost for " + distanceToTravel + " km ---");
        for (Vehicle v : fleet) {
            double cost = v.fuelCost(distanceToTravel);
            System.out.printf("%s Fuel Cost: $%.2f\n", v.getModelName(), cost);

            // Using instanceof to call a specific method unique to ElectricCar
            if (v instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) v; // Downcasting
                ec.displayBatteryHealth();
            }
        }
    }
}
