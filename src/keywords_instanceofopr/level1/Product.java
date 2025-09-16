package keywords_instanceofopr.level1;

public class Product {
    static double discount = 10.0;

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void processDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product ID: " + p.productID);
            System.out.println("Name: " + p.productName);
            System.out.println("Price: " + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 75000, 2);
        Product p2 = new Product(2, "Mouse", 500, 5);

        p1.processDetails(p1);
        p2.processDetails("Not a product");

        updateDiscount(15.0);
        p1.processDetails(p1);
    }
}