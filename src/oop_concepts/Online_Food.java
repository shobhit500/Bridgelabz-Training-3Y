package oop_concepts;

import java.util.*;

// Interface
interface Discountable {
    void applyDiscount(double percent);
    void getDiscountDetails();
}

// Abstract Class
abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;
    private double discount;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.discount = 0.0;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            discount = percent;
        }
    }

    public void getDiscountDetails() {
        System.out.println("Applied Discount: " + discount + "%");
    }

    public double getDiscount() {
        return discount;
    }

    public abstract double calculateTotalPrice();
}

// VegItem Class
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        total -= total * getDiscount() / 100;
        return total;
    }
}

// NonVegItem Class
class NonVegItem extends FoodItem {
    private double nonVegCharge = 50.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = (getPrice() + nonVegCharge) * getQuantity();
        total -= total * getDiscount() / 100;
        return total;
    }
}

// Main Class
public class Online_Food {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Tikka", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 250, 1));
        order.add(new VegItem("Veg Burger", 120, 3));
        order.add(new NonVegItem("Fish Curry", 300, 2));

        for (FoodItem item : order) {
            item.applyDiscount(10); // Apply 10% discount to all
            item.getItemDetails();
            item.getDiscountDetails();
            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            System.out.println("---------------------------");
        }
    }
}
