package Object_Modeling;
import java.util.ArrayList;

class patient {
    String name;
    int age;

    patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPatient() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor {
    String name;
    String specialization;
    ArrayList<patient> patients;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }

    void addPatient(patient p) {
        patients.add(p);
    }

    void consult(patient p) {
        System.out.println("Dr. " + name + " is consulting " + p.name);
    }

    void showDoctor() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Patients:");
        for (patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(patient p) {
        patients.add(p);
    }

    void showHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            d.showDoctor();
            System.out.println();
        }

        System.out.println("Patients:");
        for (patient p : patients) {
            p.showPatient();
            System.out.println();
        }
    }
}

class Hospital_patient{
    public static void main(String[] args) {
        patient p1 = new patient("Shobhit", 28);
        patient p2 = new patient("Riya", 32);
        patient p3 = new patient("Amit", 40);

        Doctor d1 = new Doctor("Dr. Neha", "Cardiologist");
        Doctor d2 = new Doctor("Dr. Raj", "Neurologist");

        d1.addPatient(p1);
        d1.addPatient(p2);

        d2.addPatient(p2);
        d2.addPatient(p3);

        d1.consult(p1);
        d2.consult(p3);

        Hospital h1 = new Hospital("CityCare Hospital");
        h1.addDoctor(d1);
        h1.addDoctor(d2);

        h1.addPatient(p1);
        h1.addPatient(p2);
        h1.addPatient(p3);

        h1.showHospital();
    }
}