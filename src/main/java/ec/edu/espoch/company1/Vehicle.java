
package ec.edu.espoch.company1;

public class Vehicle {

    private String internalCode;
    private String licensePlate;
    private String brand;
    private double maxLoadCapacity;
    private double batteryLevel;
    private String status;
    private double totalDistance;

    public Vehicle() {
        this.internalCode = "";
        this.licensePlate = "";
        this.brand = "";
        this.maxLoadCapacity = 0;
        this.batteryLevel = 100;
        this.status = "OFF";
        this.totalDistance = 0;
    }

    public Vehicle(String internalCode, String licensePlate, String brand, double maxLoadCapacity, double batteryLevel, String status, double totalDistance) {
        this.internalCode = internalCode;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.maxLoadCapacity = maxLoadCapacity;
        this.batteryLevel = batteryLevel;
        this.status = status;
        this.totalDistance = totalDistance;
    }


    public String InternalCode() {
        return internalCode;
    }

    public String LicensePlate() {
        return licensePlate;
    }

    public String Brand() {
        return brand;
    }

    public double MaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public double BatteryLevel() {
        return batteryLevel;
    }

    public String Status() {
        return status;
    }

    public double TotalDistance() {
        return totalDistance;
    }

    public void Status(String status) {
        this.status = status;
    }

    public void setBatteryLevel(double batteryLevel) {
        if (batteryLevel < 0) {
            this.batteryLevel = 0;
        } else if (batteryLevel > 100) {
            this.batteryLevel = 100;
        } else {
            this.batteryLevel = batteryLevel;
        }
    }

    public void addDistance(double distance) {
        if (distance > 0) {
            totalDistance += distance;
        }
    }

    public boolean canBeUsed() {
        return status.equalsIgnoreCase("OFF") && batteryLevel > 20;
    }

    public void consumeBattery(double distance) {
        double consumption = distance * 0.8;
        setBatteryLevel(batteryLevel - consumption);
    }

    public void showInfo() {
        System.out.println("Internal Code: " + internalCode);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Brand: " + brand);
        System.out.println("Max Load Capacity: " + maxLoadCapacity);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Status: " + status);
        System.out.println("Total Distance: " + totalDistance + " km");
    }
}

