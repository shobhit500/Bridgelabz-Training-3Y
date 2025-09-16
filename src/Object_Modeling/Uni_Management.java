package Object_Modeling;
import java.util.ArrayList;

class Learner {
    String learnerName;
    ArrayList<Module> enrolledModules;

    Learner(String learnerName) {
        this.learnerName = learnerName;
        enrolledModules = new ArrayList<>();
    }

    void enrollCourse(Module m) {
        enrolledModules.add(m);
        System.out.println(learnerName + " enrolled in " + m.moduleName);
    }

    void showLearner() {
        System.out.println("Learner: " + learnerName);
        for (Module m : enrolledModules) {
            System.out.println("- " + m.moduleName);
        }
    }
}

class Instructor {
    String instructorName;
    ArrayList<Module> teachingModules;

    Instructor(String instructorName) {
        this.instructorName = instructorName;
        teachingModules = new ArrayList<>();
    }

    void assignProfessor(Module m) {
        teachingModules.add(m);
        System.out.println(instructorName + " assigned to teach " + m.moduleName);
    }

    void showInstructor() {
        System.out.println("Instructor: " + instructorName);
        for (Module m : teachingModules) {
            System.out.println("- " + m.moduleName);
        }
    }
}

class Module {
    String moduleName;

    Module(String moduleName) {
        this.moduleName = moduleName;
    }

    void showModule() {
        System.out.println("Module: " + moduleName);
    }
}

class Uni_Management {
    public static void main(String[] args) {
        Module m1 = new Module("Data Structures");
        Module m2 = new Module("Operating Systems");
        Module m3 = new Module("Machine Learning");

        Learner l1 = new Learner("Shobhit");
        Learner l2 = new Learner("Riya");

        l1.enrollCourse(m1);
        l1.enrollCourse(m3);

        l2.enrollCourse(m2);

        Instructor i1 = new Instructor("Dr. Neha");
        Instructor i2 = new Instructor("Dr. Raj");

        i1.assignProfessor(m1);
        i1.assignProfessor(m2);

        i2.assignProfessor(m3);

        System.out.println("\n--- Learner Details ---");
        l1.showLearner();
        l2.showLearner();

        System.out.println("\n--- Instructor Details ---");
        i1.showInstructor();
        i2.showInstructor();
    }
}
