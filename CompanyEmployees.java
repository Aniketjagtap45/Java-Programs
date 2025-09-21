// Base class
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    void calculateBonus() {
        System.out.println("Bonus: $" + (salary * 0.10));
    }

    void performanceReport() {
        System.out.println("Performance: Satisfactory");
    }

    void manageProject() {
        System.out.println("Managing basic tasks.");
    }
}

// Subclass: Manager
class Manager extends Employee {
    void calculateBonus() {
        System.out.println("Manager Bonus: $" + (salary * 0.20));
    }

    void performanceReport() {
        System.out.println("Manager Performance: Excellent");
    }

    void manageProject() {
        System.out.println("Managing multiple teams and projects.");
    }
}

// Subclass: Developer
class Developer extends Employee {
    void calculateBonus() {
        System.out.println("Developer Bonus: $" + (salary * 0.15));
    }

    void performanceReport() {
        System.out.println("Developer Performance: Very Good");
    }

    void manageProject() {
        System.out.println("Developing features and fixing bugs.");
    }
}

// Subclass: Programmer
class Programmer extends Employee {
    void calculateBonus() {
        System.out.println("Programmer Bonus: $" + (salary * 0.12));
    }

    void performanceReport() {
        System.out.println("Programmer Performance: Good");
    }

    void manageProject() {
        System.out.println("Writing and testing code modules.");
    }
}

// Main class
public class CompanyEmployees {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Alice";
        m.address = "New York";
        m.salary = 90000;
        m.jobTitle = "Project Manager";
        m.displayDetails();
        m.calculateBonus();
        m.performanceReport();
        m.manageProject();

        System.out.println();

        Developer d = new Developer();
        d.name = "Bob";
        d.address = "San Francisco";
        d.salary = 80000;
        d.jobTitle = "Software Developer";
        d.displayDetails();
        d.calculateBonus();
        d.performanceReport();
        d.manageProject();

        System.out.println();

        Programmer p = new Programmer();
        p.name = "Charlie";
        p.address = "Chicago";
        p.salary = 70000;
        p.jobTitle = "Java Programmer";
        p.displayDetails();
        p.calculateBonus();
        p.performanceReport();
        p.manageProject();
    }
}
