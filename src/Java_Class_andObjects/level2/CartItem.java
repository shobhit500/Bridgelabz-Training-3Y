package Java_Class_andObjects.level2;
import java.util.ArrayList;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: " + getTotalPrice());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();

        // Adding items to cart
        cart.add(new CartItem("Laptop", 55000, 1));
        cart.add(new CartItem("Mouse", 1200, 2));
        cart.add(new CartItem("Notebook", 50, 5));

        // Displaying all items
        System.out.println("Cart Contents:");
        for (CartItem item : cart) {
            item.displayItem();
        }

        // Removing an item (e.g., Mouse)
        cart.removeIf(item -> item.itemName.equalsIgnoreCase("Mouse"));

        // Displaying updated cart
        System.out.println("Updated Cart:");
        for (CartItem item : cart) {
            item.displayItem();
        }

        // Calculating total cost
        double totalCost = 0;
        for (CartItem item : cart) {
            totalCost += item.getTotalPrice();
        }
        System.out.println("Total Cost: " + totalCost);
    }
}