package Object_Modeling;
import java.util.ArrayList;

class product {
    String name;
    double price;

    product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println("Product: " + name + ", Price: ₹" + price);
    }
}

class Order {
    String orderId;
    ArrayList<product> products;

    Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    void addProduct(product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in Order:");
        for (product p : products) {
            p.showProduct();
        }
    }
}

class customer {
    String name;
    ArrayList<Order> orders;

    customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed an order: " + o.orderId);
    }

    void showCustomer() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showOrder();
            System.out.println("------------------");
        }
    }
}

class Ecommerce{
    public static void main(String[] args) {
        product p1 = new product("Laptop", 55000);
        product p2 = new product("Mouse", 1200);
        product p3 = new product("Keyboard", 2500);
        product p4 = new product("Monitor", 15000);

        Order o1 = new Order("ORD001");
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order("ORD002");
        o2.addProduct(p3);
        o2.addProduct(p4);

        customer c1 = new customer("Shobhit");
        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.showCustomer();
    }
}