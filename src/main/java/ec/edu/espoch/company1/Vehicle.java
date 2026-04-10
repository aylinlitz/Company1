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
        this.internalCode;
        this.licensePlate;
        this.brand;
        this.maxLoadCapacity;
        this.batteryLevel;
        this.status;
        this.totalDistance;
    }

    public Vehicle(String internalCode, String licensePlate, String brand, double maxLoadCapacity, double batteryLevel, String status, double totalDistance) {
        this.internalCode;
        this.licensePlate;
        this.brand = brand;
        this.maxLoadCapacity;
        this.batteryLevel;
        this.status;
        this.totalDistance;
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

    public void double () {

        System.out.println("internalCode" + internalCode);
        System.out.println("internalCode" + internalCode);
        System.out.println("internalCode" + internalCode);

    }
}
