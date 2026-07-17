package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Kavya", 21, "Pune"));
        list.add(new Employee(102, "Rahul", 23, "Hyderabad"));
        list.add(new Employee(103, "Sneha", 22, "Pune"));
        list.add(new Employee(104, "Ravi", 24, "Chennai"));
        list.add(new Employee(105, "Anil", 25, "Pune"));

        List<Employee> puneEmployees = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(Employee::display);
    }
}