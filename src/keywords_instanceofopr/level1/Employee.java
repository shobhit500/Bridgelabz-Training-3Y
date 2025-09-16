package keywords_instanceofopr.level1;

public class Employee {
    static String companyName = "Tech Solutions";
    static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void showDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Name: " + e.name);
            System.out.println("ID: " + e.id);
            System.out.println("Designation: " + e.designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("Not an Employee object");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Shobhit", 101, "Developer");
        Employee e2 = new Employee("Riya", 102, "Designer");

        e1.showDetails(e1);
        e2.showDetails("Random String");

        displayTotalEmployees();
    }
}