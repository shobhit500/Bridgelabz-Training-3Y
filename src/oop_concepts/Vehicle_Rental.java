package oop_concepts;

import java.util.*;

// Interface
interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

// Abstract Class
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

// Car Class
class car extends Vehicle {
    private String insurancePolicyNumber;

    public car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500.0;
    }

    public void getInsuranceDetails() {
        System.out.println("Car Insurance Policy: " + insurancePolicyNumber);
    }
}

// Bike Class
class bike extends Vehicle {
    private String insurancePolicyNumber;

    public bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount
    }

    public double calculateInsurance() {
        return 200.0;
    }

    public void getInsuranceDetails() {
        System.out.println("Bike Insurance Policy: " + insurancePolicyNumber);
    }
}

// Truck Class
class Truck extends Vehicle {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // fixed loading fee
    }

    public double calculateInsurance() {
        return 800.0;
    }

    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Policy: " + insurancePolicyNumber);
    }
}

// Main Class
public class Vehicle_Rental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new car("CAR123", 1000, "CAR-INS-001"));
        vehicles.add(new bike("BIKE456", 500, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK789", 2000, "TRUCK-INS-003"));

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            System.out.println("Rental Cost for 5 days: ₹" + v.calculateRentalCost(5));
            System.out.println("Insurance Cost: ₹" + v.calculateInsurance());
            v.getInsuranceDetails();
            System.out.println("---------------------------");
        }
    }
}
