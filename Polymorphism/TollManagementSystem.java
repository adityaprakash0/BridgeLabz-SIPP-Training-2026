abstract class TollVehicle {
    private String vehicleNumber;
    private String ownerName;

    public TollVehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getOwnerName() { return ownerName; }

    public abstract double calculateToll();
}

class TollCar extends TollVehicle {
    public TollCar(String vehicleNumber, String ownerName) { super(vehicleNumber, ownerName); }
    @Override public double calculateToll() { return 50.0; }
}

class TollBus extends TollVehicle {
    public TollBus(String vehicleNumber, String ownerName) { super(vehicleNumber, ownerName); }
    @Override public double calculateToll() { return 150.0; }
}

class TollTruck extends TollVehicle {
    private int numberOfAxles;
    public TollTruck(String vehicleNumber, String ownerName, int axles) {
        super(vehicleNumber, ownerName);
        this.numberOfAxles = axles;
    }
    @Override public double calculateToll() { return 100.0 + (numberOfAxles * 50.0); }
}

public class TollManagementSystem {

    public static double calculateTotalRevenue(TollVehicle[] vehicles) {
        double total = 0;
        for (TollVehicle v : vehicles) total += v.calculateToll();
        return total;
    }

    public static void searchVehicle(TollVehicle[] vehicles, String targetNumber) {
        for (TollVehicle v : vehicles) {
            if (v.getVehicleNumber().equalsIgnoreCase(targetNumber)) {
                System.out.println("Vehicle Found: " + v.getOwnerName() + " | Toll Paid: $" + v.calculateToll());
                return;
            }
        }
        System.out.println("Vehicle " + targetNumber + " not found.");
    }

    public static void displayHighestTollPayer(TollVehicle[] vehicles) {
        TollVehicle highestPayer = vehicles[0];
        for (TollVehicle v : vehicles) {
            if (v.calculateToll() > highestPayer.calculateToll()) {
                highestPayer = v;
            }
        }
        System.out.println("Highest Toll Payer: " + highestPayer.getOwnerName() + " (" + highestPayer.getVehicleNumber() + ") - $" + highestPayer.calculateToll());
    }

    public static void countVehicleTypes(TollVehicle[] vehicles) {
        int carCount = 0, busCount = 0, truckCount = 0;
        for (TollVehicle v : vehicles) {
            if (v instanceof TollCar) carCount++;
            else if (v instanceof TollBus) busCount++;
            else if (v instanceof TollTruck) truckCount++;
        }
        System.out.println("Cars: " + carCount + " | Buses: " + busCount + " | Trucks: " + truckCount);
    }

    public static void main(String[] args) {
        TollVehicle[] tollQueue = {
            new TollCar("UP32-AB-1234", "Aditya"),
            new TollBus("MH01-XX-9999", "City Travels"),
            new TollTruck("HR26-ZZ-0001", "Heavy Logistics", 6) // Heavy toll
        };

        System.out.println("Total Revenue: $" + calculateTotalRevenue(tollQueue));
        System.out.println("---");
        countVehicleTypes(tollQueue);
        System.out.println("---");
        displayHighestTollPayer(tollQueue);
        System.out.println("---");
        searchVehicle(tollQueue, "MH01-XX-9999");
    }
}
