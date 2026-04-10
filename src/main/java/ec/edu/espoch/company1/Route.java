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
        this.date;
        this.deliveryArea;
        this.distanceTraveled;
        this.packagesTransported;
        this.estimatedTripTime;
        this.driver;
        this.vehicle;
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

    public double showInfo() {
        System.out.println("Date: " + date);
        System.out.println("Delivery Area: " + deliveryArea);
        System.out.println("Distance Traveled: " + distanceTraveled + " km");
        System.out.println("Packages Transported: " + packagesTransported);
        System.out.println("Estimated Trip Time: " + estimatedTripTime + " hours");

    }
}
}
