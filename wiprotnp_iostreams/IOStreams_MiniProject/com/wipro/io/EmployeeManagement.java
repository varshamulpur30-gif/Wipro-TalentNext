
import java.io.*;
import java.util.*;

public class EmployeeManagement {

    static final String FILE_NAME = "employee.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                try {

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    ArrayList<Employee> list = new ArrayList<>();

                    File file = new File(FILE_NAME);

                    if (file.exists()) {

                        ObjectInputStream ois =
                                new ObjectInputStream(new FileInputStream(file));

                        list = (ArrayList<Employee>) ois.readObject();

                        ois.close();
                    }

                    list.add(new Employee(id, name, age, salary));

                    ObjectOutputStream oos =
                            new ObjectOutputStream(new FileOutputStream(file));

                    oos.writeObject(list);

                    oos.close();

                } catch (Exception e) {
                    System.out.println("Error while saving employee.");
                }

                break;

            case 2:

                try {

                    ObjectInputStream ois =
                            new ObjectInputStream(new FileInputStream(FILE_NAME));

                    ArrayList<Employee> list =
                            (ArrayList<Employee>) ois.readObject();

                    ois.close();

                    System.out.println("-----Report-----");

                    for (Employee emp : list) {
                        System.out.println(emp);
                    }

                    System.out.println("-----End of Report-----");

                } catch (Exception e) {
                    System.out.println("No employee records found.");
                }

                break;

            case 3:

                System.out.println("Exiting the System");
                System.exit(0);

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}