package keywords_instanceofopr.level1;

public class Vehicle {
    static double registrationFee = 500.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void showDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner: " + v.ownerName);
            System.out.println("Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Shobhit", "Car", "UP85AB1234");
        Vehicle v2 = new Vehicle("Ravi", "Bike", "UP85XY5678");

        v1.showDetails(v1);
        v2.showDetails("Not a vehicle");

        updateRegistrationFee(750.0);
        v1.showDetails(v1);
    }
}