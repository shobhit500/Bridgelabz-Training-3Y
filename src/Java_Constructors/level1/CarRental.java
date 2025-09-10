package Java_Constructors.level1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 1000.0;
    }

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayDetails() {
        System.out.println("Customer: " + customerName +
                ", Car Model: " + carModel +
                ", Days: " + rentalDays +
                ", Daily Rate: ₹" + dailyRate +
                ", Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Shobhit", "Hyundai Creta", 5, 1500.0);

        System.out.println("Default Rental:");
        defaultRental.displayDetails();

        System.out.println("\nCustom Rental:");
        customRental.displayDetails();
    }
}