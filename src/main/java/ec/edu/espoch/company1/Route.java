
package ec.edu.espoch.company1;

public class Route {

    private String date;
    private String deliveryArea;
    private double distanceTraveled;
    private int packagesTransported;
    private double estimatedTripTime;
    private Driver driver;
    private Vehicle vehicle;

    public Route() {
        this.date = "    ";
        this.deliveryArea = "    ";
        this.distanceTraveled = 0;
        this.packagesTransported = 0;
        this.estimatedTripTime = 0;
        this.driver = null;
        this.vehicle = null;
    }

    public Route(String date, String deliveryArea, double distanceTraveled, int packagesTransported, double estimatedTripTime, Driver driver, Vehicle vehicle) {
        this.date = date;
        this.deliveryArea = deliveryArea;
        this.distanceTraveled = distanceTraveled;
        this.packagesTransported = packagesTransported;
        this.estimatedTripTime = estimatedTripTime;
        this.driver = driver;
        this.vehicle = vehicle;
    }

    
    public String Date() {
        return date;
    }

    public String DeliveryArea() {
        return deliveryArea;
    }

    public double DistanceTraveled() {
        return distanceTraveled;
    }

    public int PackagesTransported() {
        return packagesTransported;
    }

    public double EstimatedTripTime() {
        return estimatedTripTime;
    }

    public Driver Driver() {
        return driver;
    }

    public Vehicle Vehicle() {
        return vehicle;
    }

    public void showInfo() {
        System.out.println("Date: " + date);
        System.out.println("Delivery Area: " + deliveryArea);
        System.out.println("Distance Traveled: " + distanceTraveled + " km");
        System.out.println("Packages Transported: " + packagesTransported);
        System.out.println("Estimated Trip Time: " + estimatedTripTime + " hours");
        System.out.println("Driver: " + driver.FullName());
        System.out.println("Vehicle: " + vehicle.InternalCode() + " - " + vehicle.LicensePlate());
    }
}

