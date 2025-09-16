package Inheritance;

interface Worker {
    void performDuties();
}

class Persons {
    String name;
    int id;

    Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Persons implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Chef prepares " + specialty + " dishes.");
    }
}

class Waiter extends Persons implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    public void performDuties() {
        System.out.println("Waiter serves " + tableCount + " tables.");
    }
}

public class Restaurant_Manag {
    public static void main(String[] args) {
        Chef c1 = new Chef("Shobhit", 101, "Italian");
        Waiter w1 = new Waiter("Riya", 102, 5);

        c1.showInfo();
        c1.performDuties();
        System.out.println();

        w1.showInfo();
        w1.performDuties();
    }
}