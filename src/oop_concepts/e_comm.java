package oop_concepts;
import java.util.ArrayList;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();

    void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

class Electronics extends Product implements Taxable {
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}

class Clothing extends Product implements Taxable {
    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    public String getTaxDetails() {
        return "Clothing GST: 5%";
    }
}

class Groceries extends Product {
    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

class e_comm {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product p1 = new Electronics(101, "Smartphone", 30000);
        Product p2 = new Clothing(102, "T-Shirt", 800);
        Product p3 = new Groceries(103, "Rice Bag", 1200);

        products.add(p1);
        products.add(p2);
        products.add(p3);

        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Discount: ₹" + discount);
            System.out.println("Tax: ₹" + tax);
            System.out.println("Final Price: ₹" + finalPrice);

            if (p instanceof Taxable) {
                System.out.println(((Taxable) p).getTaxDetails());
            }

            System.out.println("------------------");
        }
    }
}