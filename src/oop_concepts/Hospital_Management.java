package oop_concepts;

import java.util.*;

// Interface
interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}

// Abstract Class
abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;
    private List<String> medicalHistory;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void addRecord(String diagnosis) {
        medicalHistory.add(diagnosis);
    }

    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }

    public abstract double calculateBill();
}

// InPatient Class
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    public double calculateBill() {
        return daysAdmitted * dailyRate + 500; // ₹500 service charge
    }
}

// OutPatient Class
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }
}

// Main Class
public class Hospital_Management {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient("P001", "Shobhit", 30, 4, 1500));
        patients.add(new OutPatient("P002", "Riya", 25, 800));

        for (Patient p : patients) {
            p.getPatientDetails();
            p.addRecord("Fever");
            p.addRecord("Blood Test");
            p.viewRecords();
            System.out.println("Total Bill: ₹" + p.calculateBill());
            System.out.println("---------------------------");
        }
    }
}