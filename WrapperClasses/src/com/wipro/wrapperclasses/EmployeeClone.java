package com.wipro.wrapperclasses;

class Employee implements Cloneable {
    int empId;
    String empName;
    double empSalary;

    // Constructor
    Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    // Method to display employee details
    void display() {
        System.out.println("EmpID: " + empId + " | Name: " + empName + " | Salary: " + empSalary);
    }

    // Override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // creates shallow copy
    }
}

public class EmployeeClone {
    public static void main(String[] args) {
        try {
            // Step 1: Create original object
            Employee original = new Employee(101, "Ravi Kumar", 45000.0);
            System.out.println("Original Employee Object:");
            original.display();

            // Step 2: Create clone of the object
            Employee clone = (Employee) original.clone();
            System.out.println("\nCloned Employee Object:");
            clone.display();

            // Step 3: Change properties of original object
            original.empId = 102;
            original.empName = "Sita Sharma";
            original.empSalary = 55000.0;

            System.out.println("\n--- After changing original object ---");
            System.out.print("Original: ");
            original.display();
            System.out.print("Clone: ");
            clone.display();

            // Step 4: Observation
            System.out.println("\nObservation: Cloning creates a separate object in memory.");
            System.out.println("Changing the original object does NOT affect the cloned object.");

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}