package Java_Class_andObjects.level1;

public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void showPhoneInfo() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 74999);
        MobilePhone phone2 = new MobilePhone("Realme", "Realme GT Neo", 28999);
        MobilePhone phone3 = new MobilePhone("Google", "Pixel 8 Pro", 85999);

        phone1.showPhoneInfo();
        phone2.showPhoneInfo();
        phone3.showPhoneInfo();
    }
}