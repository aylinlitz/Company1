
package ec.edu.espoch.company1;

public class Company1 {

        Driver driver1 = new Driver("Carlos", "Mena", "0101010101", "LIC001", 5);
        Vehicle vehicle1 = new Vehicle("EV001", "ABC-123", "Tesla", 500, 100, "OFF");
        Route route1 = new Route("2026-04-10", "Centro", 20.5, 35, 1.5, driver1, vehicle1);

        System.out.println("DRIVER INFO");
        driver1

        System.out.println("VEHICLE INFO");
        vehicle1.showInfo();

        System.out.println("......OUTE INFO..........");
        route1.showInfo();

        System.out.println("....VEHICLE VALIDATION.........");
        if (vehicle1.canBeUsed()) {
        
            System.out.println("The vehicle can be used.");
        } else {
        
            System.out.println("The vehicle cannot be used.");
        }

        vehicle1.consumeBattery(route1.getDistanceTraveled());
        vehicle1.addDistance(route1.getDistanceTraveled());

        System.out.println(".........VEHICLE INFO AFTER ROUTE........");
        vehicle1.showInfo();
    }
}
    }
}
