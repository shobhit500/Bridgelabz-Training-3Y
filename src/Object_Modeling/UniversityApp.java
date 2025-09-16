package Object_Modeling;
import java.util.ArrayList;

class Faculty {
    String name;
    String specialization;

    Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void showFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

class UniDepartment {
    String deptName;
    ArrayList<Faculty> facultyList;

    UniDepartment(String deptName) {
        this.deptName = deptName;
        facultyList = new ArrayList<>();
    }

    void addFaculty(Faculty f) {
        facultyList.add(f);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Faculty f : facultyList) {
            f.showFaculty();
            System.out.println();
        }
    }
}

class University {
    String universityName;
    ArrayList<UniDepartment> departments;

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
    }

    void addDepartment(UniDepartment d) {
        departments.add(d);
    }

    void showUniversity() {
        System.out.println("University: " + universityName);
        for (UniDepartment d : departments) {
            d.showDepartment();
            System.out.println("------------------");
        }
    }
}

class UniversityApp {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Shobhit", "Computer Science");
        Faculty f2 = new Faculty("Dr. Riya", "Mathematics");
        Faculty f3 = new Faculty("Dr. Amit", "Physics");

        UniDepartment cs = new UniDepartment("Computer Science");
        cs.addFaculty(f1);
        cs.addFaculty(f2);

        UniDepartment phy = new UniDepartment("Physics");
        phy.addFaculty(f3);

        University u1 = new University("National Tech University");
        u1.addDepartment(cs);
        u1.addDepartment(phy);

        u1.showUniversity();

        System.out.println("Independent Faculty:");
        Faculty f4 = new Faculty("Dr. Neha", "Biology");
        f4.showFaculty();

        u1 = null;
        System.gc();
    }
}