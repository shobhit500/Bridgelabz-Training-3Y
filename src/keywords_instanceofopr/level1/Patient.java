package keywords_instanceofopr.level1;

public class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void showDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid patient object");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Shobhit", 30, "Flu", 1001);
        Patient p2 = new Patient("Ananya", 25, "Migraine", 1002);

        p1.showDetails(p1);
        p2.showDetails("Not a patient");

        getTotalPatients();
    }
}