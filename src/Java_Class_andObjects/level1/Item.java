package Java_Class_andObjects.level1;
public class Item {
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    public void calculateTotalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost for " + quantity + " units: " + total);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Item item1 = new Item("01AA", "Water Bottle", 500);
        Item item2 = new Item("01BB", "Rice", 700);
        Item item3 = new Item("02AA", "Blackboard", 400);

        item1.displayDetails();
        item1.calculateTotalCost(3);

        item2.displayDetails();
        item2.calculateTotalCost(2);

        item3.displayDetails();
        item3.calculateTotalCost(5);
    }
}
