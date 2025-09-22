package oop_concepts;

import java.util.*;

// Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract Class
abstract class vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    public abstract double calculateFare(double distance);
}

// Car Class
class Car extends vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 100; // ₹100 base charge
    }
}

// Bike Class
class Bike extends vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no base charge
    }
}

// Auto Class
class Auto extends vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // ₹50 base charge
    }
}

// Main Class
public class Ride_Hailing {
    public static void main(String[] args) {
        List<vehicle> rides = new ArrayList<>();

        rides.add(new Car("CAR001", "Amit", 15.0, "Sector 21"));
        rides.add(new Bike("BIKE002", "Ravi", 10.0, "Sector 12"));
        rides.add(new Auto("AUTO003", "Sunil", 12.0, "Sector 5"));

        double rideDistance = 8.5; // in kilometers

        for (vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + rideDistance + " km: ₹" + v.calculateFare(rideDistance));
            System.out.println("---------------------------");
        }
    }
}